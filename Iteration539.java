package iteration;

import java.util.Scanner;

public class Iteration539 {
	
	/* ���� - �ݺ����1 �ڰ�����
	 * ������ ��� �Է¹޴ٰ� 100 �̻��� ���� �Է��� �Ǹ� ������ �Էµ� ���� �����Ͽ� �հ�� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (�����
	 * �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����Ѵ�.)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int count = 0;
		double avg = 0.0d;
		boolean flag = true;

		while (flag) {
			int num = sc.nextInt();

			if (num >= 100) {
				flag = false;
			}
			
			count++;
			sum += num;

		}
		avg = (double) sum / count;
		System.out.println(sum);
		System.out.println(Math.round(avg * 10) / 10.0);

	}


}
