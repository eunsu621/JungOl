package array;

public class Array570 {

	/* ���� : �迭2 - �ڰ�����7
	 * �迭�� ���� �Ʒ��� ���� ������ �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��Ģ�� ù ��° ���� ��� 1��
	 * �ʱ�ȭ �ϰ� ���� ����ʹ� �ٷ� ���� ���� �ٷ� ������ ���� ���� ���̴�.
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
