package iteration;

import java.util.Scanner;

public class Iteraion134 {

	/* 문제 : 반복제어문2 - 형성평가5
	 * 10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int odd 	= 0,
			even 	= 0;
		
		for (int i = 0; i < 10; i++) {
			int num = scan.nextInt();
			
			if (num % 2 != 0) {
				odd++;
			} else {
				even++;
			}
		}
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
	}
}

