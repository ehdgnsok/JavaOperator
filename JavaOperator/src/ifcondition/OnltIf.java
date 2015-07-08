package ifcondition;

/*
 * @date : 2015.07.08
 * @Auother : me
 * @story : If만 있는 구문에 관한 문법
 * */
public class OnltIf {
	public static void main(String[] args) {
		/*
		 * 구문 (statement) 자바 연산식에서 3가지 종류의 구문으로 나뉜다. 
		 * 1. 조건문 if ,if-else, switch
		 * 2. 반복문 while, for ,do-while 
		 * 3. 기타 구문 continue, break, return
		 */
		int x = 1, y = 2;
		if (x == y) {// 값의 비교 연산자는 ==
			System.out.println("숫자 x 와 y의 값은 같다.");

		}
		if (x != y) { // !는 부정 not이란 의미
			System.out.println("숫자 x 와 y의 값은 다르다.");

		}
		if (x > y) {
			System.out.println("숫자 x는 y 보다 크다.");

		}
		if (x < y) {
			System.out.println("숫자 x는 y 보다 작다");

		}
		if (x >= y) {
			System.out.println("숫자 x는 y 보다 크거나 같다.");

		}
		if (x <= y) {
			System.out.println("숫자 x는 y 보다 작거나 같다.");

		}
		/*
		 한구문은 반드시 하나의 결과만을 리턴하게끔 코딩 되어야 한다.
		 따라서 only if 문을 코딩할때는 개발자가 단 한가지 케이스만 출력할 것이라는
		 확신이 있을때 다룬다.
		 * */
	}
}
