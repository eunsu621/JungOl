package array;

import java.util.Scanner;

public class Array555 {
	 
	/* ���� : �迭1 - �ڰ�����1
	 * ���� 10���� ������ �� �ִ� �迭�� ����� 10���� ���ڸ� �Է¹޾� �Է¹��� ���ڸ� �̾ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] strArr = new String[10];

		for (int i = 0; i < strArr.length; i++) {
			
			strArr[i] = scan.next();
			System.out.print(strArr[i]);
		}
	}
}
