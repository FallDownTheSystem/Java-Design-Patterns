package compositeshapes;

public class Circle extends Shape {
	
	int corners = 0;
	String color;
	double size;
	
	public Circle(String color, double size) {
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
		return (getColor() + " circle has " + getCorners() + " corners and " + getSize() + " size.");
	}
	
}
