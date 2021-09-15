package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array160 {

	/* 문제 : 배열2 - 형성평가1 
	 * 승지는 주사위 놀이를 하다가 주사위를 10번 던져서 각 숫자가 몇 번씩 나왔는지 알아보려고 한다. 한번 던질
	 * 때마다 나온 주사위의 숫자를 입력받아서 각 숫자가 몇 번씩 나왔는지 출력하는 프로그램을 작성하시오.
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
