package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array160 {

	/* ���� : �迭2 - ������1 
	 * ������ �ֻ��� ���̸� �ϴٰ� �ֻ����� 10�� ������ �� ���ڰ� �� ���� ���Դ��� �˾ƺ����� �Ѵ�. �ѹ� ����
	 * ������ ���� �ֻ����� ���ڸ� �Է¹޾Ƽ� �� ���ڰ� �� ���� ���Դ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] dice = new int[6][2];

		for (int i = 0; i < dice.length; i++) {

			for (int j = 0; j < 1; j++) {
				dice[i][j] = i + 1;
			}
		}

		for (int i = 0; i < 10; i++) {

			int num = scan.nextInt();

			for (int j = 0; j < 6; j++) {

				if (num == dice[j][0]) {
					dice[j][1] += 1;
				}
			}
		}

		for (int i = 0; i < dice.length; i++) {
			System.out.println(dice[i][0] + " : " + dice[i][1]);
		}
	}
}
