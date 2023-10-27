package project9;

import java.util.ArrayList;

public class ShapeModel {
	ArrayList<Shape> shapes = new ArrayList<>();
	public ShapeModel() {
		add();
	}
 private double calcu() {
	  double totalArea = 0;
	 for (Shape shape : shapes) {
         totalArea += shape.caclulatorArea();
     }
	 return totalArea;
 }
 private double perimeter() {
	 double totalPerimeter = 0;
     for (Shape shape : shapes) {
         totalPerimeter += shape.caclulatorPerimeter();
     }
     return totalPerimeter;
 }
 public void add() {
	shapes.add(new Circle(5));
	    shapes.add(new Rectangle(4, 6));
	    shapes.add(new Triangle(3, 4, 5, 4, 3));
}
	
	public static void main(String[] args) {
		ShapeModel shape = new ShapeModel();
		System.out.println(shape.calcu());
  
	    
	   
       

	}
}
