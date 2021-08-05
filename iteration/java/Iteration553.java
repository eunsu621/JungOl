package iteration;

import java.util.Scanner;

public class Iteration553 {
	
	/*
	 * 자연수 n( 3 <= n <= 10) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		char aString = 65;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = i; j <= n; j++) {
				
				String str = String.valueOf(aString);
				System.out.print(str);
				
				aString++;
			}
			System.out.println();
		}
	}
}
