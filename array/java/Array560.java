package array;

import java.util.Scanner;

public class Array560 {
	
	/*
	 * 10���� ������ �Է¹޾� �� �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(�Է¹��� ������ 1000�� ���� �ʴ´�.)
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numArr[] = new int[10];
		
		
		for (int i = 0; i < numArr.length; i++) {
			int inputNum = scan.nextInt();
			numArr[i] = inputNum;
		}
		
		int min = numArr[0];
		
		for (int i = 0; i < numArr.length; i++) {
			
			if (numArr[i] < min) {
				min = numArr[i];
			}
		}
		System.out.println(min);
	}

}
