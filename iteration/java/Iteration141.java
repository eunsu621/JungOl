package iteration;

import java.util.Scanner;

public class Iteration141 {
	
	/*
	 * 1���� 100������ ���� �� �� ���� �Է¹޾� 100 ���� ���� ������� ���ʷ� ����ϴٰ� 10 �� ����� ��µǸ� ���α׷��� �����ϵ���
	 * ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = n; i < 100; i += n) {
			System.out.print(i + " ");

			if (i % 10 == 0) break;
		}
	}

}
