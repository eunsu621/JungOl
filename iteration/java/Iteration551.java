package iteration;

import java.util.Scanner;

public class Iteration551 {
	
	/* ���� : �ݺ����3 - �ڰ�����4
	 * �ڿ��� n�� �Է¹޾Ƽ� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}