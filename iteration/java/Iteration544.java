package iteration;

import java.util.Scanner;

public class Iteration544 {
	
	/* ���� : �ݺ����2 - �ڰ�����4
	 * 100 ������ ������ �Է¹޾Ƽ� �Է¹��� �������� 100������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum = 0;
		
		for (int i = num ; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
