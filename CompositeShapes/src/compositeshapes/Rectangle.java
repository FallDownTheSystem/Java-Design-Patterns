package compositeshapes;

public class Rectangle extends Shape {
	
	int corners = 4;
	String color;
	double size;
	
	public Rectangle(String color, double size) {
		this.color = color;
		this.size = size;
	}
	
	@Override
	public String getColor() {
		return color;
	}
	
	@Override
	public int getCorners() {
		return corners;
	}
	
	@Override
	public double getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		return (getColor() + " rectangle has " + getCorners() + " corners and " + getSize() + " size.");
	}
	
}
