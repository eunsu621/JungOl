package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array565 {

	/* 문제 : 배열2 - 자가진단2
	 * 100 미만의 양의 정수들이 주어진다.
	 * 입력받다가 0 이 입력되면 마지막에 입력된 0 을 제외하고
	 * 그 때까지 입력된 정수의 십의 자리 숫자가 각각 몇 개인지
	 * 작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)
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
