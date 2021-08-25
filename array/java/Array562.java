package array;

import java.util.Scanner;

public class Array562 {
	
	/* 문제 : 배열1 - 자가진단8
	 * 10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
	 * 평균은 반올림하여 소수첫째자리까지 출력한다.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numArr[] = new int[10];

		int oddSum = 0, evenSum = 0;

		double avg = 0;

		for (int i = 0; i < numArr.length; i++) {
			int inputNum = scan.nextInt();
			numArr[i] = inputNum;
		}

		for (int i = 1; i <= numArr.length; i++) {

			if (i % 2 == 0) {
				evenSum += numArr[i - 1];
			} else {
				oddSum += numArr[i - 1];
			}
		}

		avg = oddSum / 5.0;

		System.out.println("sum : " + evenSum);
		System.out.println("avg : " + String.format("%.1f", avg));
	}
}
