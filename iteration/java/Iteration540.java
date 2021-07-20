package iteration;

import java.util.Scanner;

public class Iteration540 {
	
	/* 문제 : 반복제어문1 - 자가진단5
	 * 정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고
	 * 3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가
	 * -1이 입력되면 종료하는 프로그램을 작성하시오.
	 * 입출력예의 진한 글씨는 실행값이다.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			int num = scan.nextInt();

			if (num == -1) {
				flag = false;
			} else if (num % 3 == 0) {
				System.out.println(num / 3);
			}
		}
	}

}
