package factorypattern;

public class Owl implements Bird {

    @Override
    public void speak() {
        System.out.println("Who?");
    }
}
