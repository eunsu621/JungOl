package iteration;

import java.util.Scanner;

public class Iteration137 {
	
	/* 문제 : 반복제어문2 - 형성평가8
	 * 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		for (int i = 1; i <= num1; i++) {
			
			for (int j = i; j <= i * num2; j+=i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
}
