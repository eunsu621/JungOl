package array;

import java.util.Scanner;

public class Array564 {

	/*
	 * ���� : �迭1 - ������ 10���� ���ڸ� �Է¹޾� ���������� �Է¹��� ���ں��� ù ��° �Է¹��� ���ڱ��� ���ʷ� ����ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] strArr = new String[10];

		for (int i = 0; i < strArr.length; i++) {
			String inputStr = scan.next();
			strArr[i] = inputStr;
		}

		for (int i = strArr.length - 1; i >= 0; i--) {
			System.out.print(strArr[i] + " ");
		}
	}
}
