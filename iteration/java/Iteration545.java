package iteration;

import java.util.Scanner;

public class Iteration545 {

	/* 문제 : 반복제어문2 - 자가진단5
	 * 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {
		 
        Scanner scan = new Scanner(System.in);
         
        int mul3 = 0,
            mul5 = 0;
 
        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();
             
            if (num % 3 == 0) {
                mul3++;
            }
            if (num % 5 == 0) {
                mul5++;
            }
        }
        System.out.println("Multiples of 3 : " + mul3);
        System.out.println("Multiples of 5 : " + mul5);
    }
}
