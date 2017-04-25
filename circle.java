package subClass;
import superClass.*;

public abstract class Circle extends Shape{
	
	private double radius;
	private double perimeter;
	private double area;
	
	public Circle(){
		super();
		radius = 0;
	}
	
	public Circle(double startRadius){
		super();
		setRadius(startRadius);
	}
	
	public setRadius(double newRadius){
		if(newRadius < 0){
			System.out.println("Radius cannot be negative");
		}
		else{
			radius = newRadius;
		}
		
	}
	
	public double calcPerimeter(){
		perimeter = 2 * PI * radius;
		return perimeter;
	}
	
	public double calcArea(){
		area = PI * radius * radius;
		return area;
	}
	
}