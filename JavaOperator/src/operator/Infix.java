package operator;

/*
 * @date : 2015.07.08
 * @Auother : me
 * @story : 이항 연산자 문법
 * */
public class Infix {
	public static void main(String[] args) {
		// 선언 및 초기화 영역
		int x = 20, y = 7, add = 0, sub = 0, gob = 0, mok = 0, nmg = 0;
		// 연산영역
		add = x + y;
		sub = x - y;
		gob = x * y;
		mok = x / y;
		nmg = x % y;
		System.out.println("+의 결과\t" + add);
		System.out.println("-의 결과\t" + sub);
		System.out.println("*의 결과\t" + gob);
		System.out.println("/의 결과\t" + mok);
		System.out.println("%의 결과\t" + nmg);
	}

}
