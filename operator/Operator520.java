package operator;

import java.util.Scanner;

public class Operator520 {
	
	/* ���� : ������ - �ڰ�����3
	 * �� ���� ������ �Է� �޾Ƽ�
	 * ��ġ���� �����ڸ� ����Ͽ� ����� ��
	 * ��ġ ���� �����ڸ� ����Ͽ� ����ϴ����α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		System.out.println(num++);
		System.out.println(++num);
	}

}
