package iteration;

import java.util.Scanner;

public class Iteration138 {
	
	/* ���� : �ݺ����2 - ������9
	 * ������ �Է¹޾� ������ ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ����
	 * ')'�� '('���̿� ������ 1ĭ �ִ�. (1,_1) ó�� ����Ѵ� : '_'�� ����
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
	
		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= num; j++) {
				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.println();
		}
	}
}
