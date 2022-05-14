
public class OperatorEx9 {

	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000; // int * int 연산 결과 오버플로우
		long b = 1_000_000 * 1_000_000L; // int * long = long
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

}
