package array;

import java.util.Scanner;

public class Array151 {

	/* ���� : �迭1 - ������2
	 * 5���� ������ �Է¹��� �� ù ��° �� ��° �ټ� ��° �Է¹��� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
