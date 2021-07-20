package iteration;

import java.util.Scanner;

public class Iteration125 {
	
	/* 문제 : 반복제어무1 - 형성평가
	 * 정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
	}

}
