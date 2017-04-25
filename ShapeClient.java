import subClass.*;

public class ShapeClient {

    public static void main(String[] args) {
		
		Rectangle myRectangle = new Rectangle(3, 5);
		Circle myCircle = new Circle(5);
		
		System.out.println("The area of myCircle is: " + myCircle.calcArea());
		System.out.println("The area of myRectangle is: " + myRectangle.calcArea());
		System.out.println("The perimeter of myCircle is: " + myCircle.calcPerimeter());
		System.out.println("The perimeter of myRectangle is: " + myRectangle.calcPerimeter());
	}
	
}