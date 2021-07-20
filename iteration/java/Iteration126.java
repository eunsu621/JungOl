package iteration;

import java.util.Scanner;

public class Iteration126 {
	
	/* ���� : �ݺ����1 - ������2
	 * 0 �̻��� �������� �������� ���еǾ� �ݺ������� �־�����.
	 * 0�� �ԷµǸ� �ݺ����� ���߰� �� ������ �Է¹��� ���鿡 ���Ͽ�
	 * Ȧ���� ������ ¦���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int odd = 0, 
			even = 0;
		
		while(true) {
			int num = scan.nextInt();
			
			if (num == 0) {
				break;
			} else if (num % 2 == 0) {
				even++;
			} else if (num % 2 != 2) {
				odd++;
			}
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}

}
