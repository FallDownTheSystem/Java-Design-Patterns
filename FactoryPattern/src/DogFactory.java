package factorypattern;

public class DogFactory implements AnimalFactory {

    @Override
    public Dog createDog(String type) {
        switch (type.toLowerCase()) {
            case "labrador":
                return new Labrador();
            case "pomeranian":
                return new Pomeranian();
            case "shepherd":
                return new Shepherd();
            default:
                System.out.println("Unknown dog.");
                break;
        }
        return null;
    }
    
    public Cat createCat(String type) {
        return null;
    }
    
    public Bird createBird(String type) {
        return null;
    }
}
