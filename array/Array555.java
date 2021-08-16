package array;

import java.util.Scanner;

public class Array555 {
	 
	/* 문제 : 배열1 - 자가진단1
	 * 문자 10개를 저장할 수 있는 배열을 만들고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] strArr = new String[10];

		for (int i = 0; i < strArr.length; i++) {
			
			strArr[i] = scan.next();
			System.out.print(strArr[i]);
		}
	}
}
