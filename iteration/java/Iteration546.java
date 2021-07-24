package iteration;

import java.util.Scanner;

public class Iteration546 {
	
	/* 문제 : 반복제어문2 - 자가진단6
	 * 10 이하의 과목수 n이 주어진다.
	 * 정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고 
	 * 평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.
	 * 평균은 반올림하여 소수 첫째자리까지 출력한다.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int sbjNum = scan.nextInt();
		double scoreSum = 0;
		
		for (int i = 0; i < sbjNum; i++) {
			
			double score = scan.nextDouble();
			
			scoreSum += score;
		}
		
		double avg = scoreSum / sbjNum;
		System.out.printf("avg : %.1f \n", avg);

		if (avg >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	
	}
}
