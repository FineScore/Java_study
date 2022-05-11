
public class PrintfEx1 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; // 8진수 10
		int hexNum = 0x10; // 16진수 10
		int binNum = 0b10; // 2진수 10
		
		System.out.printf("b=%d%n", b); // %d : 10진 정수 형식으로 출력
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d%n", c, (int)c); // char 타입은 %d로 출력할 수 없기 때문에 int로 형변환 해야만 출력 가능
		System.out.printf("finger=[%5d]%n", finger); // 5칸, 오른쪽 정렬, 나머지는 공백으로 채움
		System.out.printf("finger=[%-5d]%n", finger); // 5칸, 왼쪽 정렬, 나머지는 공백으로 채움
		System.out.printf("finger=[%05d]%n", finger); // 5칸, 오른쪽 정렬, 나머지는 0으로 채움
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // %x, %o에 #이 붙으면 0x, 0이 붙음
		System.out.printf("octNum=%o, %d%n", octNum, octNum); // %o : 8진 정수 형식으로 출력
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); // %x : 16진 정수 형식으로 출력
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); // 10진수를 2진수로 출력해주는 지시자는 없음
		// Integer.toBinaryString()는 정수를 2진수 문자열로 반환하는 메서드
		

	}

}
