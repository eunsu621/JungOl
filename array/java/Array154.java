package array;

import java.util.Scanner;

public class Array154 {

	/* ���� : �迭1 - ������4
	 * 6���� �����Ը� �Է¹޾� �������� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ������� �Ѵ�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double sum = 0.0,
			   avg = 0.0;
		
		for (int i = 0; i < 6; i++) {
			double weight = scan.nextDouble();
			
			sum += weight;
		}
		
		avg = sum / 6;
		
		System.out.println(Math.round(avg * 10) / 10.0);
	}
}
