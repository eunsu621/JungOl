package input;

public class Input512 {
	
	/* ���� - �ڰ�����4
	 * ���� ���Ը� ������ ������ �߷��� ������ ������ ������ �����ϰ�, ���� �� ���� ������ �����Ͽ� ���� ������ ����ϴ� ���α׷���
	 * �ۼ��϶�. ���� ���� = 49, �߷��� ���� = 0.2683
	 */

	public static void main(String[] args) {

		int weight = 49;
		double ratio = 0.2683d;

		//System.out.println(weight + " * " + ratio + "00 = " + weight * ratio + "00");

		System.out.printf("%d * %f = %f", weight, ratio, weight * ratio);
	}
}
