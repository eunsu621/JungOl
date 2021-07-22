package iteration;

import java.util.Scanner;

public class Iteration129 {
	
	/* 문제 : 반복제어문1 - 형성평가5
	 * 삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y'
	 * 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.
	 * (넓이는 반올림하여 소수 첫째자리까지 출력한다.)​
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		boolean flag = true;
		
		while(flag) {
			
			System.out.print("Base = ");
			int base = scan.nextInt();
			
			System.out.print("Height = ");
			int height = scan.nextInt();

			System.out.println("Triangle width = " + (double)base * height / 2);
		
			System.out.print("Continue? ");
			String answer = scan.next();
			
			if (!answer.equals("y") && !answer.equals("Y")) {
				flag = false;
			}
		}
	}

}
