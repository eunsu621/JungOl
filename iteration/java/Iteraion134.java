package iteration;

import java.util.Scanner;

public class Iteraion134 {

	/* ���� : �ݺ����2 - ������5
	 * 10���� ������ �Է¹޾� �Է¹��� ���� �� ¦���� ������ Ȧ���� ������ ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int odd 	= 0,
			even 	= 0;
		
		for (int i = 0; i < 10; i++) {
			int num = scan.nextInt();
			
			if (num % 2 != 0) {
				odd++;
			} else {
				even++;
			}
		}
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
	}
}

