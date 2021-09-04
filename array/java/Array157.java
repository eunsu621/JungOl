package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array157 {

	/* 문제 : 배열1 - 형성평가8
	 * 100 개 이하의 정수를 입력받다가 0 이 입력되면 그 때까지 입력된 정수 중 5의 배수의 개수와 합계
	 * 평균을 출력하는 프로그램을 작성하시오.
	 * 평균은 소수점 이하 1자리까지 출력한다.
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
