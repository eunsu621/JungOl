package iteration;

import java.util.Scanner;

public class Iteration634 {
	
	/* ���� : �ݺ����3 - �ڰ�����2
	 * �ڿ��� n�� �Է¹޾Ƽ� n�ٸ�ŭ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
