package conditional;

import java.util.Scanner;

public class Conditional531 {
	
	/* ���� : ������� - �ڰ�����4
	 * ����ü���� �����԰�
	 * 50.80kg ���ϸ� Flyweight,
	 * 61.23kg ���ϸ� Lightweight,
	 * 72.57kg ���ϸ� Middleweight,
	 * 88.45kg ���ϸ� Cruiserweight,
	 * 88.45kg �ʰ��� Heavyweight
	 * ��� ����.
	 * �����Ը� �Է¹޾� ü���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	 public static void main(String[] args) {

	    	Scanner scan = new Scanner(System.in);
	    	
	    	double weight = scan.nextDouble();
	    	
	    	if (weight <= 50.8) {
	    		System.out.println("Flyweight");
	    	} else if (weight <= 61.23) {
	    		System.out.println("Lightweight");
	    	} else if (weight <= 72.57) {
	    		System.out.println("Middleweight");
	    	} else if (weight <= 88.45) {
	    		System.out.println("Cruiserweight");
	    	} else {
	    		System.out.println("Heavyweight");
	    	}
	    }

}
