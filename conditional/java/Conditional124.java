package conditional;

import java.util.Scanner;

public class Conditional124 {
	
	/* 문제 : 선택제어문 - 형성평가5
	 * 1~12사이의 정수를 입력받아 평년의 경우 입력받은 월을 입력받아 평년의 경우 해당 월의 날수를 출력하는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int month = scan.nextInt();
		
		if (month % 2 != 0 && month <= 7 || month % 2 == 0 && month >=8) {
			System.out.println(31);
		} else if (month == 2) {
			System.out.println(28);
		} else {
			System.out.println(30);
		}
	}
}
