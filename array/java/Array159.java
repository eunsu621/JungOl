package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array159 {

	/* 문제 : 배열1 - 형성평가A
	 * 20 이하의 정수 n을 입력받고 n명의 점수를 입력받아 높은 점수부터 차례로 출력하는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int range = scan.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < range; i++) {
			int score = scan.nextInt();
			list.add(score);
		}
		
		// 내림차순 정렬
		Collections.sort(list, Collections.reverseOrder());
		
		for (int num : list) {
			System.out.println(num);
		}
	}
	
}
