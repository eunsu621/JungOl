package operator;

import java.util.Scanner;

public class Operator519 {

	/* 문제 : 연산자 - 자가진단2
	 * 정수 2개를 입력받아서 첫 번째 수에는 100을 증가시켜 저장하고 두 번째 수는 10으로 나눈 나머지를 저장한 후 두 수를 차례로 출력하는
	 * 프로그램을 작성하시오.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		num1 = num1 + 100;
		num2 = num2 % 10;

		System.out.println(num1 + " " + num2);

	}

}
