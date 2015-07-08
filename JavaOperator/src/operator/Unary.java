package operator;
/*
 * @date : 2015.07.08
 * @Auother : me
 * @story : 단항 연산자 문법
 * */
public class Unary {
	/*
	 단항연산자 
	 i++(후위연산자)또는 ++i(전위연산자)
	 */

	public static void main(String[] args) {
		int i=5,j=0,x=5,y=0; // 초기화 필수작업
		//후위형은 변수값을 읽어온후 연산한다.
		
		j = i++;
		System.out.println("j의값 :"+j);
		//전위형은 x의 값을 증가시키고 연산한다.
		//i=i+1;
		
		y=++x;
		System.out.println("y의값 :\t"+y);
		
	}
}
	


