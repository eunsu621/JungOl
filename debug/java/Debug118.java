package debug;

public class Debug118 {
	
	/* 문제 : 디버깅 - 형성평가3
	 * 아래의 프로그램을 작성하여 디버깅을 하면서 디버깅 창에서 ① 위치에서의 a의 값이 얼마인지 구하여 그 값을 출력하는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) {
		
		int a = 5;
		a += 10;
		a = a - 1;	// 다음 줄로 넘어가기 전까지는 15인가봅니다.
		System.out.println(15);

	}

}
