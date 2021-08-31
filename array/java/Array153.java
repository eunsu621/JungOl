package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array153 {

	/* 문제 : 배열1 - 형성평가4
	 * 100개의 정수를 입력받을 수 있는 배열을 선언한 후 정수를 차례로 입력 받다가 -1이 입력되면 입력을
	 * 중단하고 -1을 제외한 마지막 세 개의 정수를 출력하는 프로그램을 작성하시오. (입력받은 정수가 -1을 제외하고 3개 미만일 경우에는
	 * -1을 제외하고 입력받은 정수를 모두 출력한다.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Integer[] intArr = new Integer[100];

		for (int i = 0; i < intArr.length; i++) {
			int inputNum = scan.nextInt();
			intArr[i] = inputNum;

			if (inputNum == -1) {
				break;
			}
		}

		int getIndex = Arrays.asList(intArr).indexOf(-1);

		if (getIndex < 3) {
			
			for (int i = 0; i < getIndex; i++) {
				System.out.print(intArr[i] + " ");
			}
		} else {
			
			for (int i = getIndex - 3; i < getIndex; i++) {
				System.out.print(intArr[i] + " ");
			}
		}
	}
}
