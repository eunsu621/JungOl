package operator;

import java.util.Scanner;

public class Operator525 {
	
	/* 문제 : 연산자 - 자가진단
	 * 3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을
	 * 작성하시오.
	 * (JAVA는 1이면 true, 0이면 false를 출력한다.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if (num1 == num2 && num2 == num3) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
