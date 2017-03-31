package decorators;

public class FillColorDecorator extends ShapeDecorator {

    private final String color;

    public FillColorDecorator(Shape s, String c) {
        super(s);
        color = c;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Added " + color + " fill to shape.");
    }
}
