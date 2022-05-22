
public class ReferenceParamEx2 {

	public static void main(String[] args) {
		int[] x = { 10 };
		System.out.println("main() : x = " + x[0]);

		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);
	}

	static void change(int[] x) { // 배열도 참조변수를 통해 저장공간에 접근
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);
	}

}
