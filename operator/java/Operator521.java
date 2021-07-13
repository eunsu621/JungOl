package operator;

import java.util.Scanner;

public class Operator521 {
	
	/* 문제 : 연산자 - 자가진단4
	 * 두 개의 정수를 입력받아서 첫 번째수는 후치 증가 연산자를 사용하고 두 번째 수는 전치 감소 연산자를 사용하여 두 수의 곱을 구한 후
	 * 각각의 값을 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		num1 = num1++;
		num2 = --num2;
		
		int multiplication = num1++ * num2;

		System.out.print(num1 + " " + num2 + " " + multiplication);

		
	}

}
