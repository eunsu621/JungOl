package iteration;

public class Iteration547 {
	
	/* ���� : �ݺ����2 - �ڰ�����7
	 * �Ʒ��� ���� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		for (int i = 2; i <= 6; i++) {
			
			for (int j = i; j < i + 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
