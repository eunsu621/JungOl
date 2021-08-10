package iteration;

import java.util.Scanner;

public class Iteration143 {
	
	/* 문제 :  반복제어문3 - 형성평가4
	 * 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
	 * 주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		// 역삼각형
		for (int i = 1; i <= n; i++) {

			for (int space = 1; space < i; space++) {
				System.out.print(" ");
			}

			for (int star = i; star <= n * 2 - i; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 사다리꼴
		for (int i = 1; i < n; i++) {

			for (int space = 1; space < n - i; space++) {
				System.out.print(" ");
			}

			for (int star = 1; star <= i * 2 + 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
