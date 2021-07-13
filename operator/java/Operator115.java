package operator;

import java.util.Scanner;

public class Operator115 {
	
	/* 문제 : 연산자 - 형성평가5
	 * 민수와 기영이의 키와 몸무게를 입력받아 민수가 키도 크고 몸무게도 크면 1 그렇지 않으면 0을 출력하는 프로그램을 작성하시오.
	 * (JAVA는 1 이면 true, 0 이면 false를 출력한다.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int mHeight = scan.nextInt();
		int mWeight = scan.nextInt();
		
		int gHeight = scan.nextInt();
		int gWeight = scan.nextInt();
		
		if (mHeight > gHeight && mWeight > gWeight) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}

}
