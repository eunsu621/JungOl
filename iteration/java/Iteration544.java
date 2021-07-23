package iteration;

import java.util.Scanner;

public class Iteration544 {
	
	/* 문제 : 반복제어문2 - 자가진단4
	 * 100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum = 0;
		
		for (int i = num ; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
