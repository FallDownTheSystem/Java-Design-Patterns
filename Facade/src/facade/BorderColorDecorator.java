package facade;

public class BorderColorDecorator extends ShapeDecorator {

    private final String color;

    public BorderColorDecorator(Shape s, String c) {
        super(s);
        color = c;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Added " + color + " border to shape.");
    }
}
