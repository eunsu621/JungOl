package iteration;

import java.util.Scanner;

public class Iteration148 {
	
	/* ���� : �ݺ����3 - ������9
	 * �ڿ��� n�� �Է¹޾� "��� ��"�� ���� �������� �����Ͽ� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ����! '#'�� �������� �����ϵ� �ٻ��̿� ������ ����.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("# ");
			}

			System.out.println();
		}

		for (int i = 1; i < n; i++) { 

			for (int j = 1; j < i+1; j++) {
				System.out.print("  ");
			}

			for (int j = i; j < n; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}
