package conditional;

import java.util.Scanner;

public class Conditional535 {
	
	/* 문제 : 선택제어문 - 자가진단8
	 * 4.5 이하의 평점을 입력받아 그 값에 따라 다음과 같이 출력하는 프로그램을 작성하시오.
	 * (C, C++, Java는 switch ~ case문 사용) (Python은 if ~ else사용)
	 * 단 입력는 0이상 4.5 이하이다.
	 * 4.0 이상 : "scholarship" 3.0 이상 : "next semester" 2.0 이상 : "seasonal semester"
	 * 2.0 미만 : "retake"​
	 * >> 실수를 정수형(int)으로 변환하여 분기한다. (예 - switch( (int)score ))
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double grade = scan.nextDouble();
		
		// 이상이라는 표현을 switch문에서 어떻게 쓸가 했는데
		// 이렇게 정수형으로 바꿔서 사용할 수도 있네...
		switch ((int)grade) {
		case 4 : 
			System.out.println("scholarship");
			break;
		case 3 : 
			System.out.println("next semester");
			break;
		case 2 : 
			System.out.println("seasonal semester");
			break;
		default : 
			System.out.println("retake");
			break;
		}
	}
}
