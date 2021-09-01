package array;

import java.util.Scanner;

public class Array154 {

	/* 문제 : 배열1 - 형성평가4
	 * 6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램을 작성하시오.
	 * 출력은 반올림하여 소수 첫째자리까지로 한다.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double sum = 0.0,
			   avg = 0.0;
		
		for (int i = 0; i < 6; i++) {
			double weight = scan.nextDouble();
			
			sum += weight;
		}
		
		avg = sum / 6;
		
		System.out.println(Math.round(avg * 10) / 10.0);
	}
}
