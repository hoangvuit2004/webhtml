package project9;

public class Rectangle extends Shape {
	private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

	@Override
	public double caclulatorArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public double caclulatorPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + width);
	}

    
}
