package iteration;

import java.util.Scanner;

public class Iteration550 {
	
	/*
	 * �ڿ��� n�� �Է¹޾Ƽ� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n * 2; i++) {

			if (i <= n) {

				for (int j = i; j <= n; j++) {
					System.out.print("*");
				}
			} else {
				
				for (int j = n; j < i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
