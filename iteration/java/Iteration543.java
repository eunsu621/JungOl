package iteration;

import java.util.Scanner;

public class Iteration543 {
	
	/* ���� : �ݺ����2 - �ڰ�����3
	 * �ϳ��� ������ �Է¹޾� 1���� �Է¹��� ���������� ¦���� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * �ԷµǴ� ������ 50�����̴�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
