package array;

import java.util.Scanner;

public class Array560 {
	
	/*
	 * 10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.(입력받을 정수는 1000을 넘지 않는다.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numArr[] = new int[10];
		
		
		for (int i = 0; i < numArr.length; i++) {
			int inputNum = scan.nextInt();
			numArr[i] = inputNum;
		}
		
		int min = numArr[0];
		
		for (int i = 0; i < numArr.length; i++) {
			
			if (numArr[i] < min) {
				min = numArr[i];
			}
		}
		System.out.println(min);
	}

}
