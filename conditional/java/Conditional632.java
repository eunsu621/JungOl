package conditional;

import java.util.Scanner;

public class Conditional632 {
	
	/* 문제 : 선택제어문 - 자가진단9
	 * 3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int min = (num1 < num2) ? num1 : num2;
		min = (min < num3) ? min : num3;
		
		System.out.println(min);
	}

}
