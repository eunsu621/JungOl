package iteration;

import java.util.Scanner;

public class Iteration540 {
	
	/* ���� : �ݺ����1 - �ڰ�����5
	 * ������ �Է¹޾Ƽ� 3�� ����� �ƴ� ��쿡�� �ƹ� �۾��� ���� �ʰ�
	 * 3�� ����� ��쿡�� 3���� �������� ����ϴ� �۾��� �ݺ��ϴٰ�
	 * -1�� �ԷµǸ� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ����¿��� ���� �۾��� ���ప�̴�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			int num = scan.nextInt();

			if (num == -1) {
				flag = false;
			} else if (num % 3 == 0) {
				System.out.println(num / 3);
			}
		}
	}

}
