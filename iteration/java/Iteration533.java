package iteration;

import java.util.Scanner;

public class Iteration533 {
	
	/*
	 * �ڿ��� n( 3 <= n <= 10) �� �Է¹޾� ������ ���� �����ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		char aString = 65;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = i; j <= n; j++) {
				
				String str = String.valueOf(aString);
				System.out.print(str);
				
				aString++;
			}
			System.out.println();
		}
	}
}
