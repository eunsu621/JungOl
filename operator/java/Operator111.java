package operator;

import java.util.Scanner;

public class Operator111 {
	
	/* ���� : ������ - ������1
	 * ���� ���� ���� ��ǻ�� ������ ������ ������ �Է¹޾Ƽ� ������ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. (�� ����� �Ҽ��� ���ϴ� ����
	 * �Ѵ�.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();

		int sum = num1 + num2 + num3 + num4;
		int avg = sum / 4;

		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
	}

}
