package conditional;

import java.util.Scanner;

public class Conditional120 {
	
	/* 문제 : 선택제어문 - 형성평가1
	 * 두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		int max = (num1 < num2) ? num2 : num1;
		int min = (num1 < num2) ? num1 : num2;
		
		System.out.println(max - min);
	}
}
