package array;

public class Array567 {

	/* ���� : �迭2 - �ڰ�����3
	 * 3�� 5���� �迭�� �Ʒ� ��� ���� ���� �ʱ�ȭ �� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ���ڻ����� ������ 3ĭ�����ϰ� �� ���ڴ� 2ĭ���� �����ʿ� ���߾� ����Ѵ�. ��, "%2d   "
	 */

	public static void main(String[] args) {

		int[][] arr = { { 5, 8, 10, 6, 4 }, { 11, 20, 1, 13, 2 }, { 7, 9, 14, 22, 3 } };
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d   ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
