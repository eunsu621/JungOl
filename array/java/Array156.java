package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array156 {

	/* 문제 : 배열1 - 형성평가7
	 * 세 자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 프로그램을 종료하고 그 때까지 입력된 최대값과
	 * 최소값을 출력하는 프로그램을 작성하시오.입력받는 정수는 100개 이하이다.
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
