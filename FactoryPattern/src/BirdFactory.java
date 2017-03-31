package factorypattern;

public class BirdFactory implements AnimalFactory {

    @Override
    public Bird createBird(String type) {
        switch (type.toLowerCase()) {
            case "owl":
                return new Owl();
            case "parrot":
                return new Parrot();
            case "stork":
                return new Stork();
            default:
                System.out.println("Unknown bird.");
                break;
        }
        return null;
    }
    
    @Override
    public Cat createCat(String type) {
        return null;
    }
    
    @Override
    public Dog createDog(String type) {
        return null;
    }
}
