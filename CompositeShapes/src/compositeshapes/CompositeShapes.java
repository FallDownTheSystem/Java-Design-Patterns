package compositeshapes;

/**
 *
 * @author Jere Kaplas, 0403105, LUT
 */
public class CompositeShapes {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Shape circle = new Circle("Blue", 20.0);
		Shape rect = new Rectangle("Red", 16.0);
		
		Shape semiCircle = new ComplexShape("Semicircle");
		semiCircle.add(circle);
		semiCircle.add(rect);
		
		System.out.println(semiCircle);
		
	}
	
}
