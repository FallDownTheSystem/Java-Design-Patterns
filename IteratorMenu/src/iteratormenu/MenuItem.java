package iteratormenu;

public class MenuItem {
    String name;
    String description;
    float price;

    public MenuItem(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return (name + ", $" + price + "\n" + description);
    }
}
