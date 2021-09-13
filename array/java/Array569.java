package array;

import java.util.Scanner;

public class Array569 {

	/* ���� : �迭2 - �ڰ�����6
	 * 5�� �л��� ���� ���� ���� ���� 4������ ������ �Է� �޾Ƽ� �� ���κ��� ����� 80 �̻��̸顰�հݡ�
	 * �׷��� �����顰���հݡ��� ����ϰ� �հ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
