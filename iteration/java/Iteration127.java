package iteration;

import java.util.Scanner;

public class Iteration127 {
	
	/*  ���� : �ݺ����1 - ������3
	 * 0 ���� 100 ������ ������ ��� �Է¹޴ٰ� ������ ����� ���� �ԷµǸ� �� �������� �Էµ� �ڷ��� �հ�� ����� ����ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
	 * (����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����Ѵ�.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		boolean flag = true;
		int sum = 0;
		int count = 0;
		
		
		while (flag) {
			int num = scan.nextInt();
			
			if (num < 0 || num > 100) {
				flag = false;
			} else {
				sum += num;
				count++;
			}
			
		}
		
		double avg = (double)sum / count;
		
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
	}

}
