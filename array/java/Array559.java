package array;

import java.util.Scanner;

public class Array559 {
	
	/*
	 * ���� : �迭1 - �ڰ�����5
	 * 1�ݺ��� 6�ݱ����� ��������� ������ �� �� ���� �� ��ȣ�� �Է¹޾� �� �� ��������� ���� ����ϴ�
	 * ���α׷��� �ۼ��Ͻÿ�. �ݺ� ��������� �ʱⰪ���� 1�ݺ��� ���ʷ� 85.6 79.5 83.1 80.0 78.2 75.0���� �ʱ�ȭ�ϰ�
	 * ����� �Ҽ� �� ��° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� �Ѵ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] intArr = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		int banArr[] = new int[2];
		
		double sum = 0;

		for (int i = 0; i < 2; i++) {
			banArr[i] = scan.nextInt();
			
			sum += intArr[banArr[i] - 1];
		}
		System.out.println(sum);
	}

}
