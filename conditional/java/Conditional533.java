package conditional;

import java.util.Scanner;

public class Conditional533 {
	
	/* ���� : ������� - �ڰ�����6
	 * ���ڴ� 'M' ���ڴ� 'F'�� ��Ÿ����� �ϰ� 18�� �̻��� �����̶�� ����.
	 * ����('M', 'F')�� ���̸� �Է¹޾� "MAN"(���γ���), "WOMAN"(���ο���), "BOY"(�̼��Ⳳ��),
	 * "GIRL"(�̼��⿩��)�� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	 public static void main(String[] args) {

	    	Scanner scan = new Scanner(System.in);
	    	
	    	String sex = scan.next();
	    	int age = scan.nextInt();
	    	
	    	if (sex.equals("M") && age >= 18) {
	    		System.out.println("MAN");
	    	} else if (sex.equals("F") && age >= 18) {
	    		System.out.println("WOMAN");
	    	} else if (sex.equals("M") && age < 18) {
	    		System.out.println("BOY");
	    	} else {
	    		System.out.println("GIRL");
	    	}
	    	
	    }

}
