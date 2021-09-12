package array;

import java.util.Scanner;

public class Array568 {

	/* 문제 : 배열2 - 자가진단5
	 * 2행 4열의 배열 두 개를 만들어서 입력을 받고 두 배열의 곱을 구하여 출력하는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[][] arr1 = new int[2][4];
		int[][] arr2 = new int[2][4];
		
		System.out.println("first array");
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("second array");
		for (int i = 0; i < arr2.length; i++) {
			
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] * arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
