package conditional;

import java.util.Scanner;

public class Conditional533 {
	
	/* 문제 : 선택제어문 - 자가진단6
	 * 남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
	 * 성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), "BOY"(미성년남자),
	 * "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.
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
