package facade;

/**
 *
 * @author Jere Kaplas, 0403105, LUT
 */
public class Main {

    public static void main(String[] args) {
        
        ShapeMaker sm = new ShapeMaker();
        sm.drawCircle();
        sm.drawHexagon();
        sm.drawLine();
        sm.drawRectangle();
        sm.drawTriangle();
    }
}
