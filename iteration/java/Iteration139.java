package iteration;

import java.util.Scanner;

public class Iteration139 {
	
	/* ���� : �ݺ����2 - ������A
	 * 2���� 9������ �� �� 2���� �Է¹޾� �Է¹��� �� ������ �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * �� �ݵ�� ���� �Էµ� ���� �����ܺ��� �Ʒ��� ���Ŀ� �°� ����Ͽ��� �Ѵ�.
	 * ������ ������ ������ 3ĭ�̴�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			
			if (num1 >  num2) {
				
				for (int j = num1; j >= num2; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
			} else {
				
				for (int j = num1; j <= num2; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
			}
			System.out.println();
		}
	}

}
