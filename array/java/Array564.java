package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array564 {

	/* ���� : �迭2 - �ڰ�����1
	 * ���� �빮�ڸ� �Է¹޴ٰ� �빮�� �̿��� ���ڰ� �ԷµǸ� �Է��� �ߴ��ϰ�
	 * ���� �빮�ڵ鿡 ���Ͽ� 1�� �̻� �Էµ� �� ���ڿ� �� ������ ������ ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * �ԷµǴ� ������ ������ 2�� �̻� 100�� �����̴�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<String>();

		String str = scan.nextLine();
		char[] alphabet = str.replace(" ", "").toCharArray();

		int count = 0;

		for (int i = 0; i < alphabet.length; i++) {

			if (alphabet[i] >= 65 && alphabet[i] <= 90) {
				list.add(String.valueOf(alphabet[i]));
			} else {
				break;
			}
		}

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			String val = list.get(i);

			for (int j = i; j < list.size(); j++) {

				if (list.get(j).equals(val)) {
					count++;
				}
			}

			if (i > 0 && list.get(i).equals(list.get(i - 1))) {
				count = 0;
				continue;
			} else {
				System.out.println(list.get(i) + " : " + count);
			}
			count = 0;
		}
	}
	
}
