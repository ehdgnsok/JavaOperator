package operator;

import java.util.Scanner;

/*
 * order 
 * 스캐너로 두값을 입력 받아서 사칙연산 결과가 나오도록 하시오.
 * */
public class Calculator {
	public static void main(String[] args) {
		// 연산에 쓸 재료들을 준비하는 선언부
		Scanner scanner = new Scanner(System.in);
		int i=0, j=0;// 지역변수 초기화
		// 연산부
		System.out.println("숫자 입력 :");
		i = scanner.nextInt(); // next 커서 다음 글자를 변수 할당하라
		j = scanner.nextInt();
		System.out.println(i + "+" + j + "=" + (i + j));
		System.out.println(i + "-" + j + "=" + (i - j));
		System.out.println(i + "*" + j + "=" + (i * j));
		System.out.println(i + "%" + j + "=" + (i % j));
		System.out.println(i + "/" + j + "=" + (i / j));

	}

}
