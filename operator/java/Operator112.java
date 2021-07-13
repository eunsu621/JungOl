package operator;

import java.util.Scanner;

public class Operator112 {
	
	/* 문제 : 연산자 - 형성평가2
	 *  두 정수를 입력받아서 나눈 몫과 나머지를 다음과 같은 형식으로 출력하는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.printf("%d / %d = %d...%d", num1, num2, (num1 / num2), (num1 % num2));
	}
}
