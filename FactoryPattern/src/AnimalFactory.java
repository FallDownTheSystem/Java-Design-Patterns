package factorypattern;

public interface AnimalFactory {

    public Dog createDog(String type);

    public Cat createCat(String type);

    public Bird createBird(String type);
}
