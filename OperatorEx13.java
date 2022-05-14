
public class OperatorEx13 {

	public static void main(String[] args) {
		char c1 = 'a';
//		char c2 = c1 + 1; // 수식에 변수가 들어가 있는 경우 형변환을 해줘야 한다.
		char c2 = 'a' + 1; // 리터럴 간의 연산이기 때문에 컴파일러가 알아서 변환
		
		System.out.println(c2);

	}

}
