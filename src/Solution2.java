//import java.util.Stack;
//
//public class Solution2 {
//
//	class Fish {
//		int size;
//		int direction;
//
//		Fish(int pSize, int pDirection) {
//			size = pSize;
//			direction = pDirection;
//		}
//	}
//
//	public int solution(int[] A, int[] B) {
//		final int UPSTREAM = 0;
//
//		Stack<Fish> fishStack = new Stack();
//		fishStack.push(new Fish(A[0], B[0]));
//
//		for(int i=1; i<A.length; i++) {
//			//same direction, so put another fish on stack
//			fishStack.push(new Fish(A[i], B[i]));
//		}
//			// if top of stack fish is upstream, not right condition to see who's eating who else
//			if(fishStack.peek().direction == UPSTREAM) {
//				fishStack.push(new Fish(A[i], B[i]));
//			} else {
//				// figure out who's eating who
//				while (!fishStack.isEmpty()) { //current fish is swimming in same direction as top of stack fish - they can't eat other
//					if (fishStack.peek().direction == B[i]) {
//						fishStack.push(new Fish(A[i], B[i]));
//						break;
//					} else {
//						// existing fish that was on stack eats latest fish
//						if (fishStack.peek().size > A[i]) {
//							if (B[i] == fishStack.peek().direction) {
//								break; //eating finished
//							} else {
//								fishStack.pop();
//								//continue; //keep checking other elements on stack
//							}
//						}
//					}
//				}
//				if (fishStack.isEmpty()) {
//					fishStack.push(new Fish(A[i], B[i])); //current fish ate all the fish in the stack
//				}
//			}
//		}
//	    return fishStack.size();
//    }
//}
//
//
