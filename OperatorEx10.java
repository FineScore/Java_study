
public class OperatorEx10 {

	public static void main(String[] args) {
		int a = 1000000;
		
		// 연산의 순서에 따라 다른 결과를 가져올 수 있다.
		int result1 = a * a / a;
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result2);

	}

}
