package Assignment3;


//Shape class
 public abstract class Shape {
	
	abstract double area();

}
 
 // class Circle

 class Circle {

	 private double radius;
	 	
	 	
	 	public Circle(double radius) {
	         this.radius = radius;
	     }

	 	double area() {
	 		
	 		return 3.14*radius*radius;
	 		
	 	}
	 }


//class rectangle
class Rectangle extends Shape{

	private double length;
	private double breadth;

	public Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	double area() {
		
		return length*breadth;
		
		
	}
	
}

//class triangle
class Triangle extends Shape{
	private double base;
	private double hight;

	public Triangle(double base,double hight) {
		this.base=base;
		this.hight=hight;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return 0.5*base*hight;
	}
	
}

