package conditional;

import java.util.Scanner;

public class Conditional529 {
	
	/* ���� : ������� - �ڰ�����2
	 * ��������+100-Ű���� �񸸼�ġ �����̶�� ����.
	 * Ű�� �����Ը� �ڿ����� �Է¹޾� ù ��° �ٿ� �񸸼�ġ�� ����ϰ�, �񸸼�ġ�� 0���� ũ�� �����ٿ� ��("Obesity")�̶�� �޽�����
	 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (��������� �Ʒ� ��� ���� �����ϼ���.)
	 */
	
	 public static void main(String[] args) {

	    	Scanner scan = new Scanner(System.in);
	    	
	    	int height = scan.nextInt();
	    	int weight = scan.nextInt();
	    	
	    	int bmi = weight + 100 - height;
	    	
	    	System.out.println(bmi);
	    	
	    	if (bmi > 0) {
	    		System.out.println("Obesity");
	    	}
	    }


}
