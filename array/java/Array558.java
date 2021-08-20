package array;

import java.util.Scanner;

public class Array558 {
	
	/* 문제 : 배열1 - 자가진단4
	 * 100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를 가장
	 * 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] intArr = new int[100];
		
		int count = 0;

		for (int i = 0; i < intArr.length; i++) {

			// 100 개 입력
			int inputInt = scan.nextInt();
			intArr[i] = inputInt;
			
			if (inputInt == 0) {
				count = i;
				break;
			}
		}
		
		// 입력한 배열 수 만큼 생성
		int[] reverseArr = new int[count];
		
		// 뒤집어서 넣기
		for (int i = count - 1, j = 0; i >= 0; i--, j++) {
			reverseArr[j] = intArr[i];
			
			System.out.print(reverseArr[j] + " ");
		}
	}

}
