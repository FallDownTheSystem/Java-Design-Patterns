package decorators;

public class BorderThicknessDecorator extends ShapeDecorator {

    private final int thick;

    public BorderThicknessDecorator(Shape s, int t) {
        super(s);
        thick = t;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Added " + thick + "px thick border to shape.");
    }
}
