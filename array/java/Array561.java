package array;

import java.util.Scanner;

public class Array561 {
	
	/*
	 * 10���� ������ �Է¹޾� 100 �̸��� �� �� ���� ū ���� 100 �̻��� �� �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * (�ԷµǴ� ������ ������ 1�̻� 10,000 �̸��̴�. ���� �ش��ϴ� ���� ���� ������ 100 �� ����Ѵ�.)
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
