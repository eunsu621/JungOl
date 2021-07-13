package input;

import java.util.Scanner;

public class Input516 {
	
	/* 문제 : 입력 - 자가진단8
	 * 실수 2개와 한 개의 문자를 입력 받아 출력하되 실수는 반올림하여 소수 둘째자리까지 출력하는 프로그램을작성하시오.
	 * (C, C++, Java 의 경우 실수는 "double"로 선언하세요.)
	 */
	
	 public static void main(String[] args) {
		 
	        Scanner scan = new Scanner(System.in);
	         
	        double num1 = scan.nextDouble();
	        double num2 = scan.nextDouble();
	        String str = scan.next();
	         
	        System.out.printf("%.2f \n%.2f \n%s", num1, num2, str);
	    }

}
