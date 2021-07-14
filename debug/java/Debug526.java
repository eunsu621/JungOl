package debug;

import java.util.Scanner;

public class Debug526 {
	
	/* 문제 : 디버깅 - 자가진단1
	 * 2개의 실수(double)를 입력 받아서 두 수의 곱을 정수로 변환한 결과값과 두 수를 각각 정수로 변환하여 곱을 구한 결과값을 출력하는
	 * 프로그램을 작성하고 프로그램 내용에 관한 설명을 주석으로 표시하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();

		// 두 수의 곱을 정수로 표현
		int mul1 = (int) (num1 * num2);

		// 두 수를 각각 정수로 변환한 곱의 값
		int mul2 = (int) num1 * (int) num2;
		
		System.out.println(mul1 + " " + mul2);

	}

}
