package iteration;

import java.util.Scanner;

public class Iteration552 {
	
	/* ���� : �ݺ����3 - �ڰ�����5
	 * �ڿ��� n�� �Է¹޾Ƽ� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int k = i; k <= n*2-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
