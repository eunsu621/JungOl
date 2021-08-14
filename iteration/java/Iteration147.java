package iteration;

import java.util.Scanner;

public class Iteration147 {
	
	/* 문제 : 반복제어문3 - 형성평가8
	 * 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
	 * 주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int count = 1;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < i ; j++) {
				System.out.print("  ");
			}
			
			for (int j = i; j < n; j++) {
				System.out.print(count + " ");
				count++;
			}
			
			System.out.println();
		}
	}
}
