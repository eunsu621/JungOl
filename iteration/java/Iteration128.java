package iteration;

import java.util.Scanner;

public class Iteration128 {
	
	/* ���� : �ݺ����1 - ������4
	 * 0 �� �Էµ� ������ ������ ��� �Է¹޾� 3�� ����� 5�� ����� ������ ������ ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		boolean flag = true;
		
		int count = 0;
		
		while(flag) {
			int num = scan.nextInt();
			
			if (num == 0) {
				flag = false;
			} else if (num % 3 != 0 && num % 5 != 0) {
				count++;
			} 
		}
		System.out.println(count);
	}

}
