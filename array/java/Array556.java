package array;

import java.util.Scanner;

public class Array556 {
	 
	/* 문제 : 배열1 - 자가진단2
	 * 정수 10 개를 저장할 수 있는 배열을 만들어서 1 부터 10 까지를 대입하고 차례대로 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for (int i : numArr) {
			System.out.print(i + " ") ;
		}
	}
}
