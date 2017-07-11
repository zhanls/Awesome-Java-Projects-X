
public class Rectangle extends PolygonPrimitive {
	
	public Rectangle(int x, int y, int width, int height) {
		this.xPoints = new int[4];
		this.yPoints = new int[4];
		this.xPoints[0] = x;
		this.yPoints[0] = y;
		this.xPoints[1] = x;
		this.yPoints[1] = y + height;
		this.xPoints[2] = x + width;
		this.yPoints[2] = y + height;
		this.xPoints[3] = x + width;
		this.yPoints[3] = y;
	}
}
