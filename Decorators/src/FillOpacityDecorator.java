package decorators;

public class FillOpacityDecorator extends ShapeDecorator {

    private final float opacity;

    public FillOpacityDecorator(Shape s, float o) {
        super(s);
        opacity = o;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Changed fill opacity to: " + opacity);
    }
}
