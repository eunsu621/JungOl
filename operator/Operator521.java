package operator;

import java.util.Scanner;

public class Operator521 {
	
	/* ���� : ������ - �ڰ�����4
	 * �� ���� ������ �Է¹޾Ƽ� ù ��°���� ��ġ ���� �����ڸ� ����ϰ� �� ��° ���� ��ġ ���� �����ڸ� ����Ͽ� �� ���� ���� ���� ��
	 * ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		num1 = num1++;
		num2 = --num2;
		
		int multiplication = num1++ * num2;

		System.out.print(num1 + " " + num2 + " " + multiplication);

		
	}

}
