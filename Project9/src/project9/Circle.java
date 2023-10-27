package project9;

public class Circle extends Shape{
private double radius;

public Circle(double radius) {
	super();
	this.radius = radius;
}

@Override
public double caclulatorArea() {
	// TODO Auto-generated method stub
	return Math.PI*this.radius*this.radius;
}

@Override
public double caclulatorPerimeter() {
	// TODO Auto-generated method stub
	return 2*Math.PI*this.radius;
}




}
