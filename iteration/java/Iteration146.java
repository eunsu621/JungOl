package iteration;

import java.util.Scanner;

public class Iteration146 {

	/* ���� : �ݺ����3 - ������7
	 * �ڿ��� n(n��6)�� �Է¹޾� "��� ��"�� ���� �������� �����Ͽ� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ����! ���ڴ� �������� �����ϵ� �ٻ��̿� ������ ����.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char alphabet = 65;
		int count = 0;
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {
				System.out.print(alphabet + " ");
				alphabet++;
			}
			
			for (int j = 1; j < i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
}
