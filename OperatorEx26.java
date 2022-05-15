
public class OperatorEx26 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;

		// 좌측에서 결과가 나오면 우측은 평가하지 않는다.
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 = %b%n", a != 0 || ++b != 0);
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a==0 && ++b!=0 = %b%n", a == 0 && ++b != 0);
		System.out.printf("a=%d, b=%d%n", a, b);
	}

}
