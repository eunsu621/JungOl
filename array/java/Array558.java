package array;

import java.util.Scanner;

public class Array558 {
	
	/* ���� : �迭1 - �ڰ�����4
	 * 100 ���� ������ ������ �� �ִ� �迭�� �����ϰ� ������ ���ʷ� �Է¹޴ٰ� 0 �� �ԷµǸ� 0 �� �����ϰ� �� ������ �Էµ� ������ ����
	 * ���߿� �Էµ� �������� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] intArr = new int[100];
		
		int count = 0;

		for (int i = 0; i < intArr.length; i++) {

			// 100 �� �Է�
			int inputInt = scan.nextInt();
			intArr[i] = inputInt;
			
			if (inputInt == 0) {
				count = i;
				break;
			}
		}
		
		// �Է��� �迭 �� ��ŭ ����
		int[] reverseArr = new int[count];
		
		// ����� �ֱ�
		for (int i = count - 1, j = 0; i >= 0; i--, j++) {
			reverseArr[j] = intArr[i];
			
			System.out.print(reverseArr[j] + " ");
		}
	}

}
