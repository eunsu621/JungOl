package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array563 {
	
	/* ���� : �迭1 - �ڰ�����9
	 * 10���� ������ �Է¹޾� �迭�� ������ �� ������������ �����Ͽ� ����Ͻÿ�.
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
