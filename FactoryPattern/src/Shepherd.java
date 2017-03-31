package factorypattern;

public class Shepherd implements Dog {

    @Override
    public void speak() {
        System.out.println("Bark!");
    }
}
