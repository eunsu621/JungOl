package conditional;

import java.util.Scanner;

public class Conditional124 {
	
	/* ���� : ������� - ������5
	 * 1~12������ ������ �Է¹޾� ����� ��� �Է¹��� ���� �Է¹޾� ����� ��� �ش� ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int month = scan.nextInt();
		
		if (month % 2 != 0 && month <= 7 || month % 2 == 0 && month >=8) {
			System.out.println(31);
		} else if (month == 2) {
			System.out.println(28);
		} else {
			System.out.println(30);
		}
	}
}
