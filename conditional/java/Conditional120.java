package conditional;

import java.util.Scanner;

public class Conditional120 {
	
	/* ���� : ������� - ������1
	 * �� ���� ������ �Է¹޾� ū ������ ���� ���� �� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		int max = (num1 < num2) ? num2 : num1;
		int min = (num1 < num2) ? num1 : num2;
		
		System.out.println(max - min);
	}
}
