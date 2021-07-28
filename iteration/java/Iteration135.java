package iteration;

import java.util.Scanner;

public class Iteration135 {
	
	/* 문제 : 반복제어문2 - 형성평가
	 * 두 개의 정수를 입력받아 두 정수 사이(두 정수를 포함)에 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램을 작성하시오.
	 * (평균은 반올림하여 소수 첫째자리까지 출력한다.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int sum = 0,
			count = 0;
		
		double avg = 0;
		
		int max = (num1 > num2) ? num1 : num2;
		int min = (num1 < num2) ? num1 : num2;
		
		for (int i = min; i <= max; i++) {
			
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				count++;
			}
		}
		avg = (double)sum / count;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + Math.round(avg * 10) / 10.0);
		
	}

}
