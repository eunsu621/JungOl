package iteration;

import java.util.Scanner;

public class Iteration537 {
	
	/* ���� : �ݺ����1 - �ڰ�����2
	 * 100 ������ ���� ������ �Էµȴ�. while ���� �̿��Ͽ� 1���� �Է¹��� ���������� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int i = 1;
		int sum = 0;
		
		while (i <= num) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
