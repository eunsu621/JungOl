package array;

import java.util.Scanner;

public class Array568 {

	/* ���� : �迭2 - �ڰ�����5
	 * 2�� 4���� �迭 �� ���� ���� �Է��� �ް� �� �迭�� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
