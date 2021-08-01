package iteration;

import java.util.Scanner;

public class Iteration634 {
	
	/* 문제 : 반복제어문3 - 자가진단2
	 * 자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
