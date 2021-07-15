package debug;

import java.util.Scanner;

public class Debug117 {
	
	/* 문제 : 디버깅 - 형성평가2
	 * 실수로 된 3과목의 점수를 입력받아 총점은 정수부분의 합계를 출력하고 평균은 실수의 평균을 구한 뒤 정수부분만 출력하는 프로그램을
	 * 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double kor = scan.nextDouble();
		double math = scan.nextDouble();
		double eng = scan.nextDouble();
		
		int sum = (int)kor + (int)math + (int)eng;
		
		double avg = (kor + math + eng) / 3;
		
		System.out.println("sum " + sum);
		System.out.println("avg " + (int) Math.floor(avg));

	}

}
