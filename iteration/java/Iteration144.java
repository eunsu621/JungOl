package iteration;

import java.util.Scanner;

public class Iteration144 {
	
	/* ���� : �ݺ����3 - ������5
	 * �ڿ��� n�� �Է¹޾� "��� ��"�� ���� n�ٿ� ��ó ���������� ���ĵ� �ﰢ���� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.����! '*'�� '*'���̿�
	 * ������ ���� �ٻ��̿��� ������ ����.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = n; i > 0; i--) {
			
			for (int j = 0; j < n*2-1; j++) {
				
				if (j < i*2-2) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
