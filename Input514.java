package input;

import java.util.Scanner;

public class Input514 {

	/* 문제 : 입력 - 자가진단6
	 * 키를 입력받아 출력하는 프로그램을 작성하라.
	 * (입력할때 "height = " 문장을 먼저 출력하고 키를 입력 받아야 합니다.)
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("height = ");
		int height = scan.nextInt();

		System.out.println("Your height is " + height + "cm.");
	}

}
