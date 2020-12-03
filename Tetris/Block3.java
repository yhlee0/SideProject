import java.awt.Point;

public class Block3 {

//
	private Rectangle[] rectangles3=new Rectangle[4];
	private Point p3;
//
	public Block3(Point p) {
		
		Rectangle b3R0= new Rectangle(new Point(p));
		rectangles3[0]=b3R0;
		p3= new Point(rectangles3[0].getupperLeft());
		Rectangle b3R1 = new Rectangle(new Point(p3.x, p3.y+Rectangle.HEIGHT));
		rectangles3[1]=b3R1;
		Rectangle b3R2 = new Rectangle(new Point(p3.x+Rectangle.WIDTH, p3.y+Rectangle.HEIGHT));
		rectangles3[2]=b3R2;
		Rectangle b3R3= new Rectangle(new Point(p3.x+(Rectangle.WIDTH*2), p3.y+Rectangle.HEIGHT));
		rectangles3[3]=b3R3;
	}
	
	public Block3(int x, int y) {
		Rectangle b3R0= new Rectangle(new Point(x, y));
		rectangles3[0]=b3R0;
		p3= new Point(rectangles3[0].getupperLeft());
		Rectangle b3R1 = new Rectangle(new Point(p3.x, p3.y+Rectangle.HEIGHT));
		rectangles3[1]=b3R1;
		Rectangle b3R2 = new Rectangle(new Point(p3.x+Rectangle.WIDTH, p3.y+Rectangle.HEIGHT));
		rectangles3[2]=b3R2;
		Rectangle b3R3= new Rectangle(new Point(p3.x+(Rectangle.WIDTH*2), p3.y+Rectangle.HEIGHT));
		rectangles3[3]=b3R3;
	}
	
	public void translate(int x, int y) {
		for(int i=0; i<rectangles3.length;i++) {
		rectangles3[i].translate(x, y);
		}
	}
	
	public String toString() {
		return rectangles3[0].toString()+"\n"+rectangles3[1].toString()+"\n"+rectangles3[2].toString()+"\n"+rectangles3[3].toString();
	}
}