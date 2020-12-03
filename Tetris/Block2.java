import java.awt.Point;

public class Block2 {
//
	private Rectangle[] rectangles2=new Rectangle[4];
	private Point p2;
//
	public Block2(Point p) {
		
		Rectangle b2R0= new Rectangle(new Point(p));
		rectangles2[0]=b2R0;
		p2= new Point(rectangles2[0].getupperLeft());
		Rectangle b2R1 = new Rectangle(new Point(p2.x, p2.y+Rectangle.HEIGHT));
		rectangles2[1]=b2R1;
		Rectangle b2R2 = new Rectangle(new Point(p2.x, p2.y+(Rectangle.HEIGHT*2)));
		rectangles2[2]=b2R2;
		Rectangle b2R3= new Rectangle(new Point(p2.x, p2.y+(Rectangle.HEIGHT*3)));
		rectangles2[3]=b2R3;
		
	}
	public Block2(int x, int y) {
		Rectangle b2R0= new Rectangle(new Point(x, y));
		rectangles2[0]=b2R0;
		p2= new Point(rectangles2[0].getupperLeft());
		Rectangle b2R1 = new Rectangle(new Point(p2.x, p2.y+Rectangle.HEIGHT));
		rectangles2[1]=b2R1;
		Rectangle b2R2 = new Rectangle(new Point(p2.x, p2.y+(Rectangle.HEIGHT*2)));
		rectangles2[2]=b2R2;
		Rectangle b2R3= new Rectangle(new Point(p2.x, p2.y+(Rectangle.HEIGHT*3)));
		rectangles2[3]=b2R3;
	}
	
	public void translate(int x, int y) {
		for(int i=0; i<rectangles2.length;i++) {
		rectangles2[i].translate(x, y);
		}
	}
	
	public String toString() {
		return rectangles2[0].toString()+"\n"+rectangles2[1].toString()+"\n"+rectangles2[2].toString()+"\n"+rectangles2[3].toString();
			
	}
}