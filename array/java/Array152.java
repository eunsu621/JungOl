package array;

import java.util.Scanner;

public class Array152 {

	/* 문제 : 배열1 - 형성평가3
	 * 10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 짝수 번째 입력받은 정수의 합을 출력하는 프로그램을
	 * 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int oddSum = 0,
			evenSum = 0;

		for (int i = 0; i < 10; i++) {
			int num = scan.nextInt();

			if (i % 2 == 0) {
				oddSum += num;
			} else {
				evenSum += num;
			}
		}

		System.out.println("odd : " + oddSum);
		System.out.println("even : " + evenSum);
	}
}
