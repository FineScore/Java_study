
public class CallStackTest {
	
//	main -> fM -> sM -> println -> sM ���� -> fM ���� -> main ����
	public static void main(String[] args) {
		firstMethod();
	}

	static void firstMethod() {
		secondMethod();
	}

	static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
