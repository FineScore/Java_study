
public class OperatorEx2 {

	public static void main(String[] args) {
		int i = 5, j = 0;
		// 다른 수식에 포함되면 결과가 다르다.
		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
		
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);

	}

}
