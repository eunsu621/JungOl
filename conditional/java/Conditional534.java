package conditional;

import java.util.Scanner;

public class Conditional534 {
	
	/* ���� : ������� - �ڰ�����7
	 * ���� �빮�ڸ� �Է¹޾�
	 * 'A'�̸� ��Excellent��,
	 * 'B'�̸� ��Good��,
	 * 'C'�̸� ��Usually��,
	 * 'D'�̸� ��Effort��,
	 * 'F'�̸� ��Failure��,
	 * �� �� �����̸� ��error�� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String alphabet = scan.next();

		switch (alphabet) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B" :
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Usually");
			break;
		case "D" :
			System.out.println("Effort");
			break;	
		case "F" :
			System.out.println("Failure");
			break;	
		default :
			System.out.println("error");
			break;	
		}
	}

}
