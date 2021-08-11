package iteration;

import java.util.Scanner;

public class Iteration144 {
	
	/* 문제 : 반복제어문3 - 형성평가5
	 * 자연수 n을 입력받아 "출력 예"와 같이 n줄에 걸처 오른쪽으로 정렬된 삼각형이 출력되는 프로그램을 작성하시오.주의! '*'과 '*'사이에
	 * 공백이 없고 줄사이에도 빈줄이 없다.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = n; i > 0; i--) {
			
			for (int j = 0; j < n*2-1; j++) {
				
				if (j < i*2-2) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
