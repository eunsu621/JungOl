package operator;

import java.util.Scanner;

public class Operator112 {
	
	/* ���� : ������ - ������2
	 *  �� ������ �Է¹޾Ƽ� ���� ��� �������� ������ ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.printf("%d / %d = %d...%d", num1, num2, (num1 / num2), (num1 % num2));
	}
}
