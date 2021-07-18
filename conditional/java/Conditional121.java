package conditional;

import java.util.Scanner;

public class Conditional121 {
	
	/* 문제 : 선택제어문 - 형성평가2
	 * 정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		if (num == 0) {
			System.out.println("zero");
		} else if (num > 0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
	}

}
