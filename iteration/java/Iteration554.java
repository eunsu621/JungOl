package iteration;

import java.util.Scanner;

public class Iteration554 {
	
	/*
	 * 자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자 혹은 문자로 채워서 다음과 같이 출력하는 프로그램을 작성하시오. 
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		char aString = 65;
		int count = 1;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = i; j <= n; j++) {
				System.out.print(count + " ");
				count++;
			}
			
			for (int j = 1; j <= i; j++) {
				String str = String.valueOf(aString);
				System.out.print(str + " ");
				aString++;
			}
			System.out.println();
		}
	}

}
