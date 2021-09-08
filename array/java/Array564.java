package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array564 {

	/* 문제 : 배열2 - 자가진단1
	 * 영문 대문자를 입력받다가 대문자 이외의 문자가 입력되면 입력을 중단하고
	 * 영문 대문자들에 대하여 1번 이상 입력된 각 문자와 그 문자의 개수를 사전 순으로 출력하는 프로그램을 작성하시오.
	 * 입력되는 문자의 개수는 2개 이상 100개 이하이다.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<String>();

		String str = scan.nextLine();
		char[] alphabet = str.replace(" ", "").toCharArray();

		int count = 0;

		for (int i = 0; i < alphabet.length; i++) {

			if (alphabet[i] >= 65 && alphabet[i] <= 90) {
				list.add(String.valueOf(alphabet[i]));
			} else {
				break;
			}
		}

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			String val = list.get(i);

			for (int j = i; j < list.size(); j++) {

				if (list.get(j).equals(val)) {
					count++;
				}
			}

			if (i > 0 && list.get(i).equals(list.get(i - 1))) {
				count = 0;
				continue;
			} else {
				System.out.println(list.get(i) + " : " + count);
			}
			count = 0;
		}
	}
	
}
