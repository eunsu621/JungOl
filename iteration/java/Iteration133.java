package iteration;

import java.util.Scanner;

public class Iteration133 {
	
	/* ���� : �ݺ����2 - ������
	 * 100 ������ �ڿ��� n�� �Է¹ް� n���� ������ �Է¹޾� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (����� �ݿø��Ͽ� �Ҽ� ��°�ڸ�����
	 * ����ϵ��� �Ѵ�.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int sum = 0;
		
		for (int i = 0; i < num1; i++) {
			int num2 = scan.nextInt();
			
			sum += num2;
		}
		double avg = (double) sum / num1;
		
		System.out.println(Math.round(avg * 100) / 100.0);
	}

}
