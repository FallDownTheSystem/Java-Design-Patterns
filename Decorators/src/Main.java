package decorators;
/**
 *
 * @author Jere Kaplas, 0403105, LUT
 */
public class Main {

    public static void main(String[] args) {
        Shape c = new Circle();
        Shape l = new Line();
        Shape r = new Rectangle();
        Shape t = new Triangle();
        Shape h = new Hexagon();
        
        c = new BorderColorDecorator(c, "red");
        
        l = new BorderThicknessDecorator(l, 2);
        l = new BorderDashedDecorator(l, true);
        
        Shape test = new FillGradientDecorator(new FillColorDecorator(new Triangle(), "blue"), "#C00F63-#C44C32");
        Shape test2 = new FillOpacityDecorator(test, 0.5f);

        h.draw();
        System.out.println("---------------------------------------------");
        c.draw();
        System.out.println("---------------------------------------------");
        l.draw();
        System.out.println("---------------------------------------------");
        test.draw();
        System.out.println("---------------------------------------------");
        test2.draw();
    }
}
