
public class Point {
	
	private int x;
	private int y;
	
	Point(){
	}
	Point(int x, int y){
		this.x=x;
		this.y=y;
	
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}
