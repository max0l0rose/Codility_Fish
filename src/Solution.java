import java.util.Stack;

public class Solution {

	class Fish {
		int size;
		int direction;

		Fish(int pSize, int pDirection) {
			size = pSize;
			direction = pDirection;
		}

		@Override
		public String toString() {
			return "Fish{" +
					       "size=" + size +
					       ", direction=" + direction +
					       '}';
		}
	}

	public int solution(int[] A, int[] B) {
		Stack<Fish> s = new Stack();

		int survive1 = A.length;
		for(int i=0; i<A.length; i++) {
			if (B[i] == 1) {
				s.push(new Fish(A[i], B[i]));
				continue;
			}
			while (!s.empty()) {
				Fish fish = s.peek();
				if (fish.direction != B[i]) {
					survive1--;
					if (fish.size > A[i])
						break;
					else
						s.pop();
				}
			}
		}

	    return survive1;
    }
}


