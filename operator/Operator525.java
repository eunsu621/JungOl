package operator;

import java.util.Scanner;

public class Operator525 {
	
	/* ���� : ������ - �ڰ�����
	 * 3���� ������ �Է� �޾� ù ��° ���� ���� ũ�� 1 �ƴϸ� 0�� ����ϰ� �� ���� ���� ��� ������ 1 �ƴϸ� 0�� ����ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
	 * (JAVA�� 1�̸� true, 0�̸� false�� ����Ѵ�.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if (num1 == num2 && num2 == num3) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
