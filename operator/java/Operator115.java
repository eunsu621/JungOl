package operator;

import java.util.Scanner;

public class Operator115 {
	
	/* ���� : ������ - ������5
	 * �μ��� �⿵���� Ű�� �����Ը� �Է¹޾� �μ��� Ű�� ũ�� �����Ե� ũ�� 1 �׷��� ������ 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * (JAVA�� 1 �̸� true, 0 �̸� false�� ����Ѵ�.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int mHeight = scan.nextInt();
		int mWeight = scan.nextInt();
		
		int gHeight = scan.nextInt();
		int gWeight = scan.nextInt();
		
		if (mHeight > gHeight && mWeight > gWeight) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}

}
