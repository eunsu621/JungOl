package iteration;

import java.util.Scanner;

public class Iteration549 {
	
	/* ���� : �ݺ����3 - �ڰ�����1
	 * �ڿ��� n�� �Է¹ް� 1���� Ȧ���� ���ʴ�� ���س����鼭 ���� n �̻��̸� �� ������ ������ Ȧ���� ������ �� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		int sum 	= 0,
			count 	= 0;
		
		for (int i = 1; i <= n; i++) {
			
			if (i % 2 != 0) {
				sum += i;
				count++;
				
				if (sum >= n) {
					break;
				}
			}
		}
		System.out.println(count + " " + sum);
	}

}
