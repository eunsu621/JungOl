package array;

import java.util.Scanner;

public class Array569 {

	/* 문제 : 배열2 - 자가진단6
	 * 5명 학생의 국어 영어 수학 과학 4과목의 점수를 입력 받아서 각 개인별로 평균이 80 이상이면“합격”
	 * 그렇지 않으면“불합격”을 출력하고 합격한 사람의 수를 출력하는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] scores = new int[5][4];
		int passCnt = 0;
		
		for (int i = 0; i < scores.length; i++) {

			for (int j = 0; j < scores[i].length; j++) {

				scores[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < scores.length; i++) {
			double avg = 0;
			int sum = 0;
			
			for (int j = 0; j < scores[i].length; j++) {

				sum += scores[i][j];
			}
			avg = sum / scores[i].length;
			
			if (avg >= 80) {
				System.out.println("pass");
				passCnt++;
			} else {
				System.out.println("fail");
			}
		}
		System.out.println("Successful : " + passCnt);
	}
}
