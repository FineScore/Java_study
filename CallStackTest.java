
public class CallStackTest {
	
//	main -> fM -> sM -> println -> sM 제거 -> fM 제거 -> main 제거
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
