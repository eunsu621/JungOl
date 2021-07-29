package iteration;

import java.util.Scanner;

public class Iteration138 {
	
	/* 문제 : 반복제어문2 - 형성평가9
	 * 정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램을 작성하시오.
	 * 주의
	 * ')'와 '('사이에 공백이 1칸 있다. (1,_1) 처럼 출력한다 : '_'는 공백
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
	
		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= num; j++) {
				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.println();
		}
	}
}
