
public class OperatorEx16 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		// int * float = float
		// (int)float / float = float
		// int로 형변환하면서 소수점 아래는 버려진다
		float shortPi = (int)(pi * 1000) / 1000f;
		System.out.println(shortPi);

	}

}
