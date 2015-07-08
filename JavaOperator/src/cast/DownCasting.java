package cast;
/*
 * @date : 2015.07.07
 * @Auother : me
 * @story : 다운 캐스팅 문법
 * */

public class DownCasting {
	public static void main(String[] args) {
		/*
		 Down-Casting(다운캐스팅)
		 -강제 형변환
		 -프로그램에서 데이터 타입이 큰 변수(64비트)를
		    데이터 타입이 작은 변수(32비트)로
		    할당하려 할때 명시적(int)으로 타입을 
		    지정하는 것
		    -다만, 데이터 손실이 발생함
		    -개발자는 직적 다운캐스팅을 하려고 하지말고
		    이클립스를 통해 자동으로 add cast 한다.
		 * */
		int a= 4;
		double b= 6.14D;
		a=(int)b;
		System.out.println("다운 캐스팅결과 :"+a);
	}

}
