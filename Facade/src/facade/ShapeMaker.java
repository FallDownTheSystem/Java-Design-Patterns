package facade;

public class ShapeMaker {
    
    private final Shape circle;
    private final Shape line;
    private final Shape rectangle;
    private final Shape triangle;
    private final Shape hexagon;
    
    public ShapeMaker() {
        circle = new Circle();
        line = new Line();
        rectangle = new Rectangle();
        triangle = new Triangle();
        hexagon = new Hexagon();
    }
    
    public void drawCircle() {
        circle.draw();
    }
    
    public void drawLine() {
        line.draw();
    }
    
    public void drawRectangle() {
        rectangle.draw();
    }
    
    public void drawTriangle() {
        triangle.draw();
    }
    
    public void drawHexagon() {
        hexagon.draw();
    }
    
}
