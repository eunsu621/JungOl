package operator;

import java.util.Scanner;

public class Operator522 {
	
	/* ������ - �ڰ�����4
	 * �� ���� ������ �Է¹޾Ƽ� ù ��°���� ��ġ ���� �����ڸ� ����ϰ� �� ��° ���� ��ġ ���� �����ڸ� ����Ͽ� �� ���� ���� ���� ��
	 * ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		boolean result = false;

		if (num1 == num2) {
			System.out.println(!result);
		} else {
			System.out.println(result);
		}
		
		if (num1 == num2) {
			System.out.println(result);
		} else {
			System.out.println(!result);
		}
	}

}
