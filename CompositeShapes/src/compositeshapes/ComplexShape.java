package compositeshapes;

import java.util.ArrayList;

public class ComplexShape extends Shape {
	ArrayList<Shape> subShapes = new ArrayList<>();
	String name;
	
	public ComplexShape(String name) {
		this.name = name;
	}
	
	public void add(Shape shape) {
		subShapes.add(shape);
	}
	
	public void remove(Shape shape) {
		subShapes.remove(shape);
	}
	
	public Shape getSubShape(int i) {
		return (Shape)subShapes.get(i);
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		String ret = getName() + " consists of \n";
		for (Shape shape : subShapes) {
			ret += shape.toString() + "\n";
			
		}
		return ret;
	}
	
	
	
}
