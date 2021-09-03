package array;

import java.util.Scanner;

public class Array155 {

	/* 문제 : 배열1 - 형성평가6
	 * 6개의 문자배열을 만들고 {'J', 'U', 'N', 'G', 'O', 'L'} 으로 초기화 한 후 문자 한
	 * 개를 입력받아 배열에서의 위치를 출력하는 프로그램을 작성하시오.
	 * 첫 번째 위치는 0번이며 배열에 없는 문자가 입력되면 "none" 라는 메시지를 출력하고 끝내는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char[] charArr = { 'J', 'U', 'N', 'G', 'O', 'L' };

		String target = scan.next();
		String none = "";

		for (int i = 0; i < charArr.length; i++) {

			if (Character.toString(charArr[i]).matches(target)) {
				System.out.println(i);
				none = "isValue";
				break;
			} else {
				none = "none";
			}
		}
		
		if (none.equals("none")) {
			System.out.println(none);
		}
	}
}
