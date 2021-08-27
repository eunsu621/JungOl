package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array563 {
	
	/* 문제 : 배열1 - 자가진단9
	 * 10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			int inputNum = scan.nextInt();
			numArr[i] = inputNum;
		}

		Arrays.sort(numArr);
		
		for (int i = numArr.length - 1 ; i >= 0; i--) {
			System.out.print(numArr[i] + " ");
		}
	}
}
