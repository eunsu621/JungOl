package operator;

import java.util.Scanner;

public class Operator523 {
	
	/* ���� : ������ - �ڰ�����6
	 * �� ���� ������ �Է¹޾Ƽ� ������ ���� 4���� ���迬������ ����� ����Ͻÿ�.
	 * �̶� �Է¹��� �� ������ �̿��Ͽ� ����Ͻÿ�.
	 * (JAVA�� 1�̸� true, 0�̸� false�� ����Ѵ�.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println(num1 + " > " + num2 + " --- " + (num1 > num2));
		System.out.println(num1 + " < " + num2 + " --- " + (num1 < num2));
		System.out.println(num1 + " >= " + num2 + " --- " + (num1 >= num2));
		System.out.println(num1 + " <= " + num2 + " --- " + (num1 <= num2));
	}

}
