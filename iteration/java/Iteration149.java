package iteration;

import java.util.Scanner;

public class Iteration149 {
	
	/* ���� : �ݺ����3 - ������A
	 * �ڿ��� n�� �Է¹޾� "��� ��"�� ���� n x nũ�⿡ �������� �����Ͽ� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 10 �̸��� Ȧ���� ����Ͻÿ�.
	 * ����! ���ڴ� �������� �����ϵ� �ٻ��̿� ������ ����.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int odd = 1;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				System.out.print(odd + " ");
				
				if (odd == 9) {
					odd = 1;
				} else {
					odd += 2;
				}
			}
			System.out.println();
		}
	}
}
