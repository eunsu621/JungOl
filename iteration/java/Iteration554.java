package iteration;

import java.util.Scanner;

public class Iteration554 {
	
	/*
	 * �ڿ��� n�� �Է¹޾Ƽ� n���� �ٿ� n+1���� ���� Ȥ�� ���ڷ� ä���� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		char aString = 65;
		int count = 1;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = i; j <= n; j++) {
				System.out.print(count + " ");
				count++;
			}
			
			for (int j = 1; j <= i; j++) {
				String str = String.valueOf(aString);
				System.out.print(str + " ");
				aString++;
			}
			System.out.println();
		}
	}

}
