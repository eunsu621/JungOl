package iteration;

import java.util.Scanner;

public class Iteration128 {
	
	/* 문제 : 반복제어문1 - 형성평가4
	 * 0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		boolean flag = true;
		
		int count = 0;
		
		while(flag) {
			int num = scan.nextInt();
			
			if (num == 0) {
				flag = false;
			} else if (num % 3 != 0 && num % 5 != 0) {
				count++;
			} 
		}
		System.out.println(count);
	}

}
