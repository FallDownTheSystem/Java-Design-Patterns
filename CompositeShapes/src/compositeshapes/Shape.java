package compositeshapes;

public abstract class Shape {
	
	public void add(Shape shape) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(Shape shape) {
		throw new UnsupportedOperationException();
	}
	
	public String getColor() {
		throw new UnsupportedOperationException();
	}

	public double getSize() {
		throw new UnsupportedOperationException();
	}

	public int getCorners() {
		throw new UnsupportedOperationException();
	}
}
