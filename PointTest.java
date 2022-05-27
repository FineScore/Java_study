
public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

// 컴파일 에러
// Point()가 정의되어 있지 않기 때문
class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {

		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation() {
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}
