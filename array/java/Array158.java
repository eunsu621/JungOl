package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array158 {

	/* 문제 : 배열1 - 형성평가9
	 * 정수를 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지 입력 받은 개수를 출력한 후
	 * 입력받은 정수를 차례로 출력하되 그 수가 홀수이면 2배한 값을,
	 * 짝수인 경우에는 2로 나눈 몫을 출력하는 프로그램을 작성하시오.
	 * 입력되는 정수의 개수는 100개 이하이다.
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
