package conditional;

import java.util.Scanner;

public class Conditional532 {
	
	/* ���� : ������� - �ڰ�����5
	 * �� ���� �Ǽ��� �Է¹޾� ��� 4.0 �̻��̸� "A", ��� 3.0 �̻��̸� "B", �ƴϸ� "C" ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	 public static void main(String[] args) {

	    	Scanner scan = new Scanner(System.in);
	    	
	    	double grade1 = scan.nextDouble();
	    	double grade2 = scan.nextDouble();
	    	
	    	if (grade1 >= 4.0 && grade2 >= 4.0) {
	    		System.out.println("A");
	    	} else if (grade1 >= 3.0 && grade2 >= 3.0) {
	    		System.out.println("B");
	    	} else {
	    		System.out.println("C");
	    	}
	    	
	    
	    }

}
