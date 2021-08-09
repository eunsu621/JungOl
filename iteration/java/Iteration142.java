package iteration;

import java.util.Scanner;

public class Iteration142 {
	
	/* 문제 : 반복제어문2 - 형성평가
	 * 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
	 * 주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n * 2; i++) {

			if (i < n) {
				
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				
				for (int j = i; j < n * 2; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
