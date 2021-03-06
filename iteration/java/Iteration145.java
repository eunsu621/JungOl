package iteration;

import java.util.Scanner;

public class Iteration145 {
	
	/* 문제 : 반복제어문3 - 형성평가6
	 * 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
	 * 주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			
			for (int j = i; j < n*2-i; j++) {
				System.out.print(" ");
			}

			int count = 1;

			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}

}
