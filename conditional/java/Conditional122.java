package conditional;

import java.util.Scanner;

public class Conditional122 {
	
	/* 문제 : 선택제어문 - 형성평가3
	 * 년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.
	 */
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();
		
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("leap year");
		} else {
			System.out.println("common year");
		}
	}

}
