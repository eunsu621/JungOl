package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array566 {

	/* ���� : �迭2 - �ڰ�����3
	 * 100 ������ �ڿ����� �Է¹޾� ù ��° ���� 100���� �� ��° ���� �Է¹��� ���� �ʱ�ȭ�ϰ� ����
	 * �׺��ʹ� �����׿��� ������ �� ���� ä�������� ������ �ۼ��Ͽ� �� ���� ������ ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		
		list.add(100);
		list.add(scan.nextInt());
		
		while (true) {
			
			list.add(list.get(count) - list.get(count+1));
			count++;
			
			if (list.get(count+1) < 0) break;
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
