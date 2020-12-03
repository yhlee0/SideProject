
public class Circle extends Shape{
	
	private Point center;
	private int radius;
	
	public Circle(Point p, int r) {
		center=p;
		radius=r;
		
	}
	public Circle(int x, int y, int r) {
		center=new Point(x,y);
		radius=r;
	}
	

	@Override
	public double getArea(){
		return radius*radius*Math.PI; 
	}
	@Override
	public double getPerimeter() {
		 return 2*radius*Math.PI; 
	}
	@Override
	public String toString() {
		return "Circle:\ncenter: "+center +"\nradius: "+radius;
	}
}
