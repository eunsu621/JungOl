package iteration;

public class Iteration548 {
	
	/* 문제 : 반복제어문2 - 자가진단7
	 * 구구단의 일부를 다음과 같이 출력하는 프로그램을 작성하시오.
	 * 곱셈의 결과는 오른쪽으로 맞추어 출력을 하고 결과값 사이의 공백은 3칸으로 한다.
	 * 출력형식 예) 2_*_1_=__2___ (_는 공백을 나타내는 것임)​
	 */
	
	public static void main(String[] args) {

		for (int i = 2; i <= 4; i++) {
			
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%d * %d = %2d   ", i, j, i*j);
			}
			System.out.println();
		}

	}

}
