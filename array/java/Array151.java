package array;

import java.util.Scanner;

public class Array151 {

	/* 문제 : 배열1 - 형성평가2
	 * 5개의 정수를 입력받은 후 첫 번째 세 번째 다섯 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] intArr = new int[5];
		int sum = 0;
		
		for (int i = 0; i < intArr.length; i++) {
			int inputNum = scan.nextInt();
			intArr[i] = inputNum;
			
			if (i % 2 == 0) {
				sum += intArr[i];
			}
		}
		System.out.println(sum);
	}
}
