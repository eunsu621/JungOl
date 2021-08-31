package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array153 {

	/* ���� : �迭1 - ������4
	 * 100���� ������ �Է¹��� �� �ִ� �迭�� ������ �� ������ ���ʷ� �Է� �޴ٰ� -1�� �ԷµǸ� �Է���
	 * �ߴ��ϰ� -1�� ������ ������ �� ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (�Է¹��� ������ -1�� �����ϰ� 3�� �̸��� ��쿡��
	 * -1�� �����ϰ� �Է¹��� ������ ��� ����Ѵ�.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Integer[] intArr = new Integer[100];

		for (int i = 0; i < intArr.length; i++) {
			int inputNum = scan.nextInt();
			intArr[i] = inputNum;

			if (inputNum == -1) {
				break;
			}
		}

		int getIndex = Arrays.asList(intArr).indexOf(-1);

		if (getIndex < 3) {
			
			for (int i = 0; i < getIndex; i++) {
				System.out.print(intArr[i] + " ");
			}
		} else {
			
			for (int i = getIndex - 3; i < getIndex; i++) {
				System.out.print(intArr[i] + " ");
			}
		}
	}
}
