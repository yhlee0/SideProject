
public class Rectangle extends Shape {

	private Point p1;
	private Point p2;
	
	public Rectangle(Point p1, Point p2){
		this.p1=p1;
		this.p2=p2;
	}
	public Rectangle(int x1, int y1, int x2, int y2){
		this.p1=new Point(x1, y1);
		this.p2=new Point(x2, y2);
	}
	
	@Override
	public double getArea() {

		double xlength=Math.abs(p1.getX()-p2.getX());
		double ylength=Math.abs(p1.getY()-p2.getY());

		return xlength*ylength;
	}
	
	@Override
	public double getPerimeter() {

		double xlength=Math.abs(p1.getX()-p2.getX());
		double ylength=Math.abs(p1.getY()-p2.getY());
		
		return (xlength*2)+(ylength*2);
	}
	@Override
	public String toString() {
		return "Rectangle:\np1: " +p1 +"\np2: "+p2;
	}
}