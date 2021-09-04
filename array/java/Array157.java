package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array157 {

	/* ���� : �迭1 - ������8
	 * 100 �� ������ ������ �Է¹޴ٰ� 0 �� �ԷµǸ� �� ������ �Էµ� ���� �� 5�� ����� ������ �հ�
	 * ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ����� �Ҽ��� ���� 1�ڸ����� ����Ѵ�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		
		int sum = 0,
			count = 0;
		
		double avg = 0.0;
		
		for (int i = 0; i < 100; i++) {
			int num = scan.nextInt();
			
			if (num == 0) break;
			
			list.add(num);
		}
		
		for (int i = 0; i < list.size(); i++) {
			
			int value = list.get(i);
			
			if (value % 5 == 0) {
				sum += value;
				count += 1;
			}
		}
		avg = (double)sum / count;
		
		System.out.println("Multiples of 5 : " + count);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + Math.round(avg * 10) / 10.0);
		
	}
}
