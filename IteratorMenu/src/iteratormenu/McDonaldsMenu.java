package iteratormenu;

public class McDonaldsMenu implements Menu {
    static final int MAX_ITEMS = 99;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public McDonaldsMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Double whammy", "Whatever you want!", 2.99f);
        addItem("A triple double chicken sandwich", "*Not real chicken", 4.99f);
    }

	@Override
    public void addItem(String name, String description, float price) {
        MenuItem menuItem = new MenuItem(name, description, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu is full.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
	
    @Override
    public void removeItem(int position) {
        if (position <= 0) {
            throw new IllegalStateException
                ("Index must be positive and within range of the menu items.");
        }
        if (menuItems[position-1] != null) {
            for (int i = position-1; i < (numberOfItems); i++) {
                menuItems[i] = menuItems[i+1];
            }
			numberOfItems--;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new McDonaldsMenuIterator(menuItems);
    }
}
