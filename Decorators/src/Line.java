package decorators;

public class Line implements Shape {

    @Override
    public void draw() {
        System.out.println("Printing a Line");
    }
}
