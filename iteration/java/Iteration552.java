package iteration;

import java.util.Scanner;

public class Iteration552 {
	
	/* 문제 : 반복제어문3 - 자가진단5
	 * 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int k = i; k <= n*2-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
