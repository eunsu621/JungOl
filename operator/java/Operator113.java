package operator;

import java.util.Scanner;

public class Operator113 {

	/* ���� : ������ - ������3
	 * ���簢���� ���ο� ������ ���̸� ������ ������ �Է¹��� �� ������ ���̴� 5 ������Ű�� ������ ���̴� 2���Ͽ� ������ �� ������ ����
	 * ������ ���� ���̸� ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int width = scan.nextInt();
		int length = scan.nextInt();
		
		width = width + 5;
		length = length * 2;
		
		int area = width * length;
		
		System.out.println("width = " + width);
		System.out.println("length = " + length);
		System.out.println("area = " + area);
		
	}
}
