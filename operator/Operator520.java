package operator;

import java.util.Scanner;

public class Operator520 {
	
	/* 문제 : 연산자 - 자가진단3
	 * 한 개의 정수를 입력 받아서
	 * 후치증가 연산자를 사용하여 출력한 후
	 * 전치 증가 연산자를 사용하여 출력하는프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		System.out.println(num++);
		System.out.println(++num);
	}

}
