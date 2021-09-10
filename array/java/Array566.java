package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array566 {

	/* 문제 : 배열2 - 자가진단3
	 * 100 이하의 자연수를 입력받아 첫 번째 항은 100으로 두 번째 항은 입력받은 수로 초기화하고 다음
	 * 항부터는 전전항에서 전항을 뺀 수로 채워나가는 수열을 작성하여 그 수가 음수가 나올 때까지 출력하는 프로그램을 작성하시오.
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
