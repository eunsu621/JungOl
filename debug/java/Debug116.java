package debug;

import java.util.Scanner;

public class Debug116 {
	
	/* 문제 : 디버깅 - 형성평가1
	 * 정수로 된 3과목의 점수를 입력받아 평균을 구한 후 반올림하여 소수 첫째자리까지 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int kor = scan.nextInt();
		int math = scan.nextInt();
		int eng = scan.nextInt();
		
		double avg = (double)(kor + math + eng) / 3;
		
		System.out.println(Math.round(avg * 10) / 10.0);

	}
}
