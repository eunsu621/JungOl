package iteration;

import java.util.Scanner;

public class Iteration143 {
	
	/* ���� :  �ݺ����3 - ������4
	 * �ڿ��� n�� �Է¹޾� "��� ��"�� ���� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ����! '*'�� '*'���̿� ������ ���� �ٻ��̿��� ������ ����.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		// ���ﰢ��
		for (int i = 1; i <= n; i++) {

			for (int space = 1; space < i; space++) {
				System.out.print(" ");
			}

			for (int star = i; star <= n * 2 - i; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ��ٸ���
		for (int i = 1; i < n; i++) {

			for (int space = 1; space < n - i; space++) {
				System.out.print(" ");
			}

			for (int star = 1; star <= i * 2 + 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
