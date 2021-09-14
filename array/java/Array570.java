package array;

public class Array570 {

	/* 문제 : 배열2 - 자가진단7
	 * 배열을 만들어서 아래와 같이 저장한 후 출력하는 프로그램을 작성하시오. 규칙은 첫 번째 행은 모두 1로
	 * 초기화 하고 다음 행부터는 바로 위의 값과 바로 왼쪽의 값을 더한 것이다.
	 */
	
	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		for (int i = 1; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				arr[0][j] = 1;

				if (j == 0) {
					arr[i][j] = arr[i - 1][j];
				} else {
					arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
