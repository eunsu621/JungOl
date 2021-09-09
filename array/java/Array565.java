package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array565 {

	/* ���� : �迭2 - �ڰ�����2
	 * 100 �̸��� ���� �������� �־�����.
	 * �Է¹޴ٰ� 0 �� �ԷµǸ� �������� �Էµ� 0 �� �����ϰ�
	 * �� ������ �Էµ� ������ ���� �ڸ� ���ڰ� ���� �� ������
	 * ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (0���� ���ڴ� ������� �ʴ´�.)
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		
		while (true) {
			int num = scan.nextInt();
			int tens = (num) / 10 ^ (1 - 1) % 10;

			if (num == 0) {
				break;
			}

			list.add(tens);
		}
		
		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			count = Collections.frequency(list, list.get(i));
		
			if (i > 0 && list.get(i) == list.get(i-1)) continue;
			
			System.out.println(list.get(i) + " : " + count);
		}
	}

}
