package facade;

public class FillGradientDecorator extends ShapeDecorator {

    private final String gradient;

    public FillGradientDecorator(Shape s, String g) {
        super(s);
        gradient = g;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Added " + gradient + " gradient fill to shape.");
    }
}
