package test.mypac;

public class Rect extends Shape {
	private int side;

	public Rect(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}

	public void printArea() {
		double area2 = (side * side);
		System.out.println("사각형의 넓이: " + area2);
	}

	@Override
	public void printInfo() {
		System.out.println("사각형의 x좌표: " + getX() + "\n사각형의 y좌표: " + getY() + "\n사각형의 변의 길이: " + side);
	}
}
