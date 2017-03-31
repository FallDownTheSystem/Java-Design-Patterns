package decorators;

public class BorderDashedDecorator extends ShapeDecorator {

    private final boolean dash;

    public BorderDashedDecorator(Shape s, boolean d) {
        super(s);
        dash = d;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Border dashed: " + dash);
    }
}
