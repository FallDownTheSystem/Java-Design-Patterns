package facade;

public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape s) {
        shape = s;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
