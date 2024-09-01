package Assignment3;

//class test

public class ShapeTest{
	public static void main(String[] args) {
		
		Circle circle=new Circle(5);
		Rectangle rectangle=new Rectangle(13, 15);
		Triangle triangle =new Triangle(12, 10.5);
		
		System.out.println("Cricle area = "+ circle.area());
		System.out.println("Rectangle area = "+ rectangle.area());
		System.out.println("Triangle area = "+ triangle.area());
				
	}
}

