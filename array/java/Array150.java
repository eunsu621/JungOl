package array;

import java.util.Scanner;

public class Array150 {

	/*
	 * 문제 : 배열1 - 형성평가1
	 * 10개의 문자를 입력받아 마지막으로 입력받은 문자부터 첫 번째 입력받은 문자까지 차례로 출력하는 프로그램을
	 * 작성하시오.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] strArr = new String[10];

		for (int i = 0; i < strArr.length; i++) {
			String inputStr = scan.next();
			strArr[i] = inputStr;
		}

		for (int i = strArr.length - 1; i >= 0; i--) {
			System.out.print(strArr[i] + " ");
		}
	}
}
