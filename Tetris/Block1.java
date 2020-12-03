import java.awt.Point;

public class Block1 {
//
	private Rectangle[] rectangles=new Rectangle[4];
	private Point p1;
//
	public Block1(Point p) {
		Rectangle b1R0= new Rectangle(new Point(p));
		rectangles[0]=b1R0;
		p1= new Point(rectangles[0].getupperLeft());
		Rectangle b1R1 = new Rectangle(new Point(p1.x+Rectangle.WIDTH, p1.y));
		rectangles[1]=b1R1;
		Rectangle b1R2 = new Rectangle(new Point(p1.x, p1.y+Rectangle.HEIGHT));
		rectangles[2]=b1R2;
		Rectangle b1R3= new Rectangle(new Point(p1.x+Rectangle.WIDTH, p1.y+Rectangle.HEIGHT));
		rectangles[3]=b1R3;
	}
	public Block1(int x, int y) {
		Rectangle b1R0= new Rectangle(new Point(x, y));
		rectangles[0]=b1R0;
		p1= new Point(rectangles[0].getupperLeft());
		Rectangle b1R1 = new Rectangle(new Point(p1.x+Rectangle.WIDTH, p1.y));
		rectangles[1]=b1R1;
		Rectangle b1R2 = new Rectangle(new Point(p1.x, p1.y+Rectangle.HEIGHT));
		rectangles[2]=b1R2;
		Rectangle b1R3= new Rectangle(new Point(p1.x+Rectangle.WIDTH, p1.y+Rectangle.HEIGHT));
		rectangles[3]=b1R3;
	}
	
	public void translate(int x, int y) {
		for(int i=0; i<rectangles.length;i++) {
		rectangles[i].translate(x, y);
		}
	}
	
	public String toString() {
		return rectangles[0].toString()+"\n"+rectangles[1].toString()+"\n"+rectangles[2].toString()+"\n"+rectangles[3].toString();
	}
}