package iteration;

import java.util.Scanner;

public class Iteration140 {
	
	/* ���� : �ݺ����3 - ������1
	 * ���� 20 ���� �Է¹޾Ƽ� �� �հ� ����� ����ϵ� 0 �� �ԷµǸ� 20�� �Է��� ������ �ʾҴ��� �� ������ �Էµ� �հ� ����� ����ϴ�
	 * ���α׷��� �ۼ��Ͻÿ�.
	 * ����� �Ҽ��κ��� ������ ������ ����Ѵ�.(0�� �Էµ� ��� 0�� ������ �հ� ����� ���Ѵ�.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int sum 	= 0,
			avg 	= 0,
			count 	= 0;

		for (int i = 0; i < 20; i++) {
			int n = scan.nextInt();
			
			if (n == 0) {
				break;
			} else {
				sum += n;
				count += 1;
			}
		}
		avg = sum / count;
		
		System.out.println(sum + " " + avg);
	}

}
