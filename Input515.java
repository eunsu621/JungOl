package input;

import java.util.Scanner;

public class Input515 {
	
	/* ���� : �Է� - �ڰ�����7
	 * �� ���� ������ �Է� �޾� ���� ���� ����Ͻÿ�.
	 * (���� �Է� �޴� ���� �׻� ũ�� �ԷµǴ� �� ������ 1�̻� 500�����̴�.)
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
		System.out.println();
		System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
	}

}
