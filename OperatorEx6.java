
public class OperatorEx6 {

	public static void main(String[] args) {
		// byte a = 10;
		// byte b = 20;
		// byte c = a + b; // a + b의 결과값은 int형이기 때문에 byte에 넣을 수 없다.
		// System.out.println(c);

		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b); // int에서 byte로 형변환했기 때문에 데이터 손실 발생
		System.out.println(c);
	}

}
