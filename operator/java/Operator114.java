package operator;

import java.util.Scanner;

public class Operator114 {
	
	/* ���� : ������ - ������4
	 * �� ������ �Է¹޾� ù ��° ���� ��ġ���������ڸ� ����ϰ� �� ��° ���� ��ġ���ҿ����ڸ� ����Ͽ� ����ϰ� �ٲ� ���� �ٽ� ����ϴ�
	 * ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(++num1 + " " + num2);
		System.out.println(num1 + " " + --num2);
		
	}

}
