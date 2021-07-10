package operator;

import java.util.Scanner;

public class Operator518 {
	
	/* 문제 - 자가진단1
	 * 세 개의 정수를 입력 받아서 합계와 평균을 출력하시오.
	 * (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		int sum = 0, avg = 0;

		sum = num1 + num2 + num3;
		avg = sum / 3;

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);

	}
}
