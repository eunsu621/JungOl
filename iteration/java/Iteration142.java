package iteration;

import java.util.Scanner;

public class Iteration142 {
	
	/* ���� : �ݺ����2 - ������
	 * �ڿ��� n�� �Է¹޾� "��� ��"�� ���� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ����! '*'�� '*'���̿� ������ ���� �ٻ��̿��� ������ ����.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n * 2; i++) {

			if (i < n) {
				
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				
				for (int j = i; j < n * 2; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
