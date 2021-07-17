package conditional;

import java.util.Scanner;

public class Conditional534 {
	
	/* 문제 : 선택제어문 - 자가진단7
	 * 영문 대문자를 입력받아
	 * 'A'이면 “Excellent”,
	 * 'B'이면 “Good”,
	 * 'C'이면 “Usually”,
	 * 'D'이면 “Effort”,
	 * 'F'이면 “Failure”,
	 * 그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String alphabet = scan.next();

		switch (alphabet) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B" :
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Usually");
			break;
		case "D" :
			System.out.println("Effort");
			break;	
		case "F" :
			System.out.println("Failure");
			break;	
		default :
			System.out.println("error");
			break;	
		}
	}

}
