package iteration;

import java.util.Scanner;

public class Iteration545 {

	/* ���� : �ݺ����2 - �ڰ�����5
	 * 10���� ������ �Է¹޾� 3�� ����� ������ 5�� ����� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
