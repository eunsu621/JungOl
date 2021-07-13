package operator;

import java.util.Scanner;

public class Operator111 {
	
	/* 문제 : 연산자 - 형성평가1
	 * 국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서 총점과 평균을 구하는 프로그램을 작성하시오. (단 평균의 소수점 이하는 버림
	 * 한다.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();

		int sum = num1 + num2 + num3 + num4;
		int avg = sum / 4;

		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
	}

}
