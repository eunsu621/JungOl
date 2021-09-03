package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array156 {

	/* ���� : �迭1 - ������7
	 * �� �ڸ� ������ ������ ���ʷ� �Է� �޴ٰ� 999�� �ԷµǸ� ���α׷��� �����ϰ� �� ������ �Էµ� �ִ밪��
	 * �ּҰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.�Է¹޴� ������ 100�� �����̴�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		
		boolean run = true;
		
		int max = 0,
			min = 0;
				
		while(run) {
			int num = scan.nextInt();
			
			if (num == 999) {
				run = false;
			} else {
				list.add(num);
			}
		}
		
		max = Collections.max(list);
		min = Collections.min(list);
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
