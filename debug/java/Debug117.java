package debug;

import java.util.Scanner;

public class Debug117 {
	
	/* ���� : ����� - ������2
	 * �Ǽ��� �� 3������ ������ �Է¹޾� ������ �����κ��� �հ踦 ����ϰ� ����� �Ǽ��� ����� ���� �� �����κи� ����ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double kor = scan.nextDouble();
		double math = scan.nextDouble();
		double eng = scan.nextDouble();
		
		int sum = (int)kor + (int)math + (int)eng;
		
		double avg = (kor + math + eng) / 3;
		
		System.out.println("sum " + sum);
		System.out.println("avg " + (int) Math.floor(avg));

	}

}
