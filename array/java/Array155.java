package array;

import java.util.Scanner;

public class Array155 {

	/* ���� : �迭1 - ������5
	 * 6���� ���ڹ迭�� ����� {'J', 'U', 'N', 'G', 'O', 'L'} ���� �ʱ�ȭ �� �� ���� ��
	 * ���� �Է¹޾� �迭������ ��ġ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ù ��° ��ġ�� 0���̸� �迭�� ���� ���ڰ� �ԷµǸ� "none" ��� �޽����� ����ϰ� ������ ���α׷��� �ۼ��Ͻÿ�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char[] charArr = { 'J', 'U', 'N', 'G', 'O', 'L' };

		String target = scan.next();
		String none = "";

		for (int i = 0; i < charArr.length; i++) {

			if (Character.toString(charArr[i]).matches(target)) {
				System.out.println(i);
				none = "isValue";
				break;
			} else {
				none = "none";
			}
		}
		
		if (none.equals("none")) {
			System.out.println(none);
		}
	}
}
