package operator;

import java.util.Scanner;

public class Operator519 {

	/* ���� : ������ - �ڰ�����2
	 * ���� 2���� �Է¹޾Ƽ� ù ��° ������ 100�� �������� �����ϰ� �� ��° ���� 10���� ���� �������� ������ �� �� ���� ���ʷ� ����ϴ�
	 * ���α׷��� �ۼ��Ͻÿ�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		num1 = num1 + 100;
		num2 = num2 % 10;

		System.out.println(num1 + " " + num2);

	}

}
