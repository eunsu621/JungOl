package iteration;

import java.util.Scanner;

public class Iteration133 {
	
	/* 문제 : 반복제어문2 - 형성평가
	 * 100 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력하는 프로그램을 작성하시오. (평균은 반올림하여 소수 둘째자리까지
	 * 출력하도록 한다.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int sum = 0;
		
		for (int i = 0; i < num1; i++) {
			int num2 = scan.nextInt();
			
			sum += num2;
		}
		double avg = (double) sum / num1;
		
		System.out.println(Math.round(avg * 100) / 100.0);
	}

}
