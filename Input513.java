package input;

public class Input513 {
	
	/* ����- �ڰ�����5
	 * 1�ߵ�(yd)�� 91.44cm�̰� 1��ġ(in)�� 2.54cm�̴�.
	 * 2.1�ߵ�� 10.5��ġ�� ���� cm�� ��ȯ�Ͽ� ���� ���Ŀ� ���߾� �Ҽ� ù°�ڸ����� ����Ͻÿ�.
	 */

	public static void main(String[] args) {
		
		float yd = 91.44f, in = 2.54f;

		System.out.printf(" 2.1yd = %.1fcm \r\n10.5in =  %.1fcm", yd * 2.1, in * 10.5);

	}

}
