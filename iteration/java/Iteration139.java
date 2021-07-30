package iteration;

import java.util.Scanner;

public class Iteration139 {
	
	/* 문제 : 반복제어문2 - 형성평가A
	 * 2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.
	 * 단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.
	 * 구구단 사이의 공백은 3칸이다.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			
			if (num1 >  num2) {
				
				for (int j = num1; j >= num2; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
			} else {
				
				for (int j = num1; j <= num2; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
			}
			System.out.println();
		}
	}

}
