package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array159 {

	/* ���� : �迭1 - ������A
	 * 20 ������ ���� n�� �Է¹ް� n���� ������ �Է¹޾� ���� �������� ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int range = scan.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < range; i++) {
			int score = scan.nextInt();
			list.add(score);
		}
		
		// �������� ����
		Collections.sort(list, Collections.reverseOrder());
		
		for (int num : list) {
			System.out.println(num);
		}
	}
	
}
