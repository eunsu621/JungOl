package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array158 {

	/* ���� : �迭1 - ������9
	 * ������ �Է¹޴ٰ� 0 �� �ԷµǸ� 0 �� �����ϰ� �� ������ �Է� ���� ������ ����� ��
	 * �Է¹��� ������ ���ʷ� ����ϵ� �� ���� Ȧ���̸� 2���� ����,
	 * ¦���� ��쿡�� 2�� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * �ԷµǴ� ������ ������ 100�� �����̴�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		
		while (true) {
			int num = scan.nextInt();
			
			if (num == 0) break;
			
			list.add(num);
		}
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			int value = list.get(i);
			
			if (value % 2 != 0) {
				System.out.print(value * 2 + " ");
			} else {
				System.out.print(value / 2 + " ");
			}
		}
	}
}
