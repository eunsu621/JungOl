package operator;

import java.util.Scanner;

public class Operator523 {
	
	/* 문제 : 연산자 - 자가진단6
	 * 두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출력하시오.
	 * 이때 입력받은 두 정수를 이용하여 출력하시오.
	 * (JAVA는 1이면 true, 0이면 false를 출력한다.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println(num1 + " > " + num2 + " --- " + (num1 > num2));
		System.out.println(num1 + " < " + num2 + " --- " + (num1 < num2));
		System.out.println(num1 + " >= " + num2 + " --- " + (num1 >= num2));
		System.out.println(num1 + " <= " + num2 + " --- " + (num1 <= num2));
	}

}
