package array;

import java.util.Scanner;

public class Array557 {
	 
	/* ���� : �迭1 - �ڰ�����3
	 * ���� 10 ���� ������ �� �ִ� �迭�� ���� 1 ���� 10 ������ �����ϰ� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] strArr = new String[10];

		int count = 0;

		for (int i = 0; i < 10; i++) {

			String inputStr = scan.next();
			strArr[i] = inputStr;

			if (i == count && count < 9) {
				System.out.print(strArr[i] + " ");
				count += 3;
			}
		}
	}
	
}
