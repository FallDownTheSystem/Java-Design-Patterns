package factorypattern;

public class CatFactory implements AnimalFactory {

    @Override
    public Cat createCat(String type) {
        switch (type.toLowerCase()) {
            case "persian":
                return new Persian();
            case "burmese":
                return new Burmese();
            case "siamese":
                return new Siamese();
            default:
                System.out.println("Unknown cat.");
                break;
        }
        return null;
    }
    
    @Override
    public Bird createBird(String type) {
        return null;
    }
    
    @Override
    public Dog createDog(String type) {
        return null;
    }
}
