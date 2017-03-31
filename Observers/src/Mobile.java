package observers;

public class Mobile implements Observer {

    private final String name;
    
    public Mobile(String n) {
        name = n;
    }
    
    @Override
    public void update(Subject s) {
        Application app = (Application) s;
        System.out.println("\n"+app.getName() + " -> " + name + ": " + app.getUpdate());
    }
    
    public String getName() {
        return name;
    }
}
