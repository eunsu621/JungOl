package debug;

import java.util.Scanner;

public class Debug116 {
	
	/* ���� : ����� - ������1
	 * ������ �� 3������ ������ �Է¹޾� ����� ���� �� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int kor = scan.nextInt();
		int math = scan.nextInt();
		int eng = scan.nextInt();
		
		double avg = (double)(kor + math + eng) / 3;
		
		System.out.println(Math.round(avg * 10) / 10.0);

	}
}
