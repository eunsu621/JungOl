package iteration;

import java.util.Scanner;

public class Iteration148 {
	
	/* 문제 : 반복제어문3 - 형성평가9
	 * 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
	 * 주의! '#'은 공백으로 구분하되 줄사이에 빈줄은 없다.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("# ");
			}

			System.out.println();
		}

		for (int i = 1; i < n; i++) { 

			for (int j = 1; j < i+1; j++) {
				System.out.print("  ");
			}

			for (int j = i; j < n; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}
