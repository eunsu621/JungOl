package iteration;

import java.util.Scanner;

public class Iteration550 {
	
	/*
	 * 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n * 2; i++) {

			if (i <= n) {

				for (int j = i; j <= n; j++) {
					System.out.print("*");
				}
			} else {
				
				for (int j = n; j < i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
