package input;

import java.util.Scanner;

public class Input516 {

	/*
	 * ���� : �Է� - �ڰ�����8
	 * �Ǽ� 2���� �� ���� ���ڸ� �Է� �޾� ����ϵ� �Ǽ��� �ݿø��Ͽ� �Ҽ� ��°�ڸ����� ����ϴ�
	 * ���α׷����ۼ��Ͻÿ�.
	 * (C, C++, Java �� ��� �Ǽ��� "double"�� �����ϼ���.)
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		String str = scan.next();

		System.out.printf("%.2f \n%.2f \n%s", num1, num2, str);
	}

}
