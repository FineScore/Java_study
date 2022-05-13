
public class CastingEx3 {

	public static void main(String[] args) {
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;
		
		// 정밀도 차이때문에 서로 다른 값이 저장
		System.out.printf("f=%20.18f\n", f);
		System.out.printf("d=%20.18f\n", d);
		System.out.printf("d2=%20.18f\n", d2);
		

	}

}
