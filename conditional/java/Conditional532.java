package conditional;

import java.util.Scanner;

public class Conditional532 {
	
	/* 문제 : 선택제어문 - 자가진단5
	 * 두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
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
