package array;

import java.util.Scanner;

public class Array557 {
	 
	/* 문제 : 배열1 - 자가진단3
	 * 정수 10 개를 저장할 수 있는 배열을 만들어서 1 부터 10 까지를 대입하고 차례대로 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] strArr = new String[10];

		int count = 0;

		for (int i = 0; i < 10; i++) {

			String inputStr = scan.next();
			strArr[i] = inputStr;

			if (i == count && count < 9) {
				System.out.print(strArr[i] + " ");
				count += 3;
			}
		}
	}
	
}
