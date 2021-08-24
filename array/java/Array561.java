package array;

import java.util.Scanner;

public class Array561 {
	
	/*
	 * 10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
	 * (입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numArr[] = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			int inputNum = scan.nextInt();
			numArr[i] = inputNum;
		}

		int min = 10000;
		int max = 1;

		for (int i = 0; i < numArr.length; i++) {

			if (numArr[i] >= 100 && numArr[i] < min) {
				min = numArr[i];

			} else if (numArr[i] > max && numArr[i] < 100) {
				max = numArr[i];
			}
		}
		
		if (max == 1) {
			max = 100;
		} else if (min == 10000) {
			min = 100;
		}
		
		System.out.println(max + " " + min);
	}
}
