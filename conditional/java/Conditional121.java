package conditional;

import java.util.Scanner;

public class Conditional121 {
	
	/* ���� : ������� - ������2
	 * ������ �Է¹޾� 0 �̸� "zero" ����̸� "plus" �����̸� "minus" ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		if (num == 0) {
			System.out.println("zero");
		} else if (num > 0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
	}

}
