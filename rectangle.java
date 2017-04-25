package subClass;
import superClass.*;

public abstract class Rectangle extends Shape{
	
	private double width;
	private double height;
	private double area;
	private double perimeter;
	
	public Rectangle(){
		super();
		
		width = 0;
		height = 0;
	}
	
	public Rectangle(double startWidth, double startHeight){
		super();
		
		setHeight(startHeight);
		setWidth(startWidth);
	}
	
	public void setWidth(double newWidth){
		if(newWidth < 0){
			System.out.println("Width cannot be negative. Try again.");
		}
		else{
			width = newWidth;
		}
	}
	
	public void setHeight(double newHeight){
		if(newHeight < 0){
			System.out.println("Height cannot be negative. Try again.");
		}
		else{
			height = newHeight;
		}
	}
	
	public double calcPerimeter(){
		perimeter = (2 * width) + (2 * height);
		return perimeter;
	}
	
	public double calcArea(){
		area = width * height;
		return area;
	}
}