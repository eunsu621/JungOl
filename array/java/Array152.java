package array;

import java.util.Scanner;

public class Array152 {

	/* ���� : �迭1 - ������3
	 * 10���� ������ �Է¹޾� Ȧ�� ��° �Է¹��� ������ �հ� ¦�� ��° �Է¹��� ������ ���� ����ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
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
