package iteration;

import java.util.Scanner;

public class Iteration145 {
	
	/* ���� : �ݺ����3 - ������6
	 * �ڿ��� n�� �Է¹޾� "��� ��"�� ���� �������� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ����! ���ڸ� �������� �����ϵ� �ٻ��̿� ������ ����.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			
			for (int j = i; j < n*2-i; j++) {
				System.out.print(" ");
			}

			int count = 1;

			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}

}
