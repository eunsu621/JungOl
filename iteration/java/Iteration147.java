package iteration;

import java.util.Scanner;

public class Iteration147 {
	
	/* ���� : �ݺ����3 - ������8
	 * �ڿ��� n�� �Է¹޾� "��� ��"�� ���� �������� �����Ͽ� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ����! ���ڴ� �������� �����ϵ� �ٻ��̿� ������ ����.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int count = 1;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < i ; j++) {
				System.out.print("  ");
			}
			
			for (int j = i; j < n; j++) {
				System.out.print(count + " ");
				count++;
			}
			
			System.out.println();
		}
	}
}
