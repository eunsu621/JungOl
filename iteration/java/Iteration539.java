package iteration;

import java.util.Scanner;

public class Iteration539 {
	
	/* 문제 - 반복제어문1 자가진단
	 * 정수를 계속 입력받다가 100 이상의 수가 입력이 되면 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오. (평균은
	 * 반올림하여 소수 첫째자리까지 출력한다.)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int count = 0;
		double avg = 0.0d;
		boolean flag = true;

		while (flag) {
			int num = sc.nextInt();

			if (num >= 100) {
				flag = false;
			}
			
			count++;
			sum += num;

		}
		avg = (double) sum / count;
		System.out.println(sum);
		System.out.println(Math.round(avg * 10) / 10.0);

	}


}
