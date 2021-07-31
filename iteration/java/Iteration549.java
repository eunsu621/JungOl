package iteration;

import java.util.Scanner;

public class Iteration549 {
	
	/* 문제 : 반복제어문3 - 자가진단1
	 * 자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		int sum 	= 0,
			count 	= 0;
		
		for (int i = 1; i <= n; i++) {
			
			if (i % 2 != 0) {
				sum += i;
				count++;
				
				if (sum >= n) {
					break;
				}
			}
		}
		System.out.println(count + " " + sum);
	}

}
