package conditional;

import java.util.Scanner;

public class Conditional122 {
	
	/* ���� : ������� - ������3
	 * �⵵�� �Է¹޾� ����(leap year)���� ���(common year)���� �Ǵ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();
		
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("leap year");
		} else {
			System.out.println("common year");
		}
	}

}
