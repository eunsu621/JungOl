package conditional;

import java.util.Scanner;

public class Conditional530 {
	
	/* ���� : ������� - �ڰ�����3
	 * ���̸� �Է¹޾� 20�� �̻��̸� "adult"��� ����ϰ� �׷��� ������ �� ���Ŀ� ������ �Ǵ����� "�� years later"���
	 * �޽����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	 public static void main(String[] args) {

	    	Scanner scan = new Scanner(System.in);
	    	
	    	int age = scan.nextInt();
	    	
	    	if (age >= 20) {
	    		System.out.println("adult");
	    	} else {
	    		System.out.println(20 - age + " years later");
	    	}
	    }

}
