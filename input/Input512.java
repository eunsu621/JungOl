package input;

public class Input512 {
	
	/* 문제 - 자가진단4
	 * 추의 무게를 저장할 변수와 중력의 비율을 저장할 변수를 선언하고, 다음 두 값을 변수에 저장하여 곱셈 계산식을 출력하는 프로그램을
	 * 작성하라. 추의 무게 = 49, 중력의 비율 = 0.2683
	 */

	public static void main(String[] args) {

		int weight = 49;
		double ratio = 0.2683d;

		//System.out.println(weight + " * " + ratio + "00 = " + weight * ratio + "00");

		System.out.printf("%d * %f = %f", weight, ratio, weight * ratio);
	}
}
