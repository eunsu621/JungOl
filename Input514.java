package input;

import java.util.Scanner;

public class Input514 {

	/* ���� : �Է� - �ڰ�����6
	 * Ű�� �Է¹޾� ����ϴ� ���α׷��� �ۼ��϶�.
	 * (�Է��Ҷ� "height = " ������ ���� ����ϰ� Ű�� �Է� �޾ƾ� �մϴ�.)
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("height = ");
		int height = scan.nextInt();

		System.out.println("Your height is " + height + "cm.");
	}

}
