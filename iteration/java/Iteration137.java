package iteration;

import java.util.Scanner;

public class Iteration137 {
	
	/* ���� : �ݺ����2 - ������8
	 * ��� ���� ���� �Է¹޾� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		for (int i = 1; i <= num1; i++) {
			
			for (int j = i; j <= i * num2; j+=i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
}
