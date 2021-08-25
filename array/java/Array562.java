package array;

import java.util.Scanner;

public class Array562 {
	
	/* ���� : �迭1 - �ڰ�����8
	 * 10���� ������ �Է¹޾� �迭�� ������ �� ¦�� ��° �Էµ� ���� �հ� Ȧ�� ��° �Էµ� ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ����� �ݿø��Ͽ� �Ҽ�ù°�ڸ����� ����Ѵ�.
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
