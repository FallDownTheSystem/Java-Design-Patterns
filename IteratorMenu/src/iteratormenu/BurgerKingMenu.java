package iteratormenu;

import java.util.ArrayList;

public class BurgerKingMenu implements Menu {
    ArrayList menuItems;

    public BurgerKingMenu() {
        menuItems = new ArrayList();

        addItem("Cheeserburger", "Perfect for cheap drunk people!", 1.00f);
        addItem("Double cheese burger", "Perfect for less cheap drunk people!", 2.59f);
    }

	@Override
    public void addItem(String name, String description, float price) {
        MenuItem menuItem = new MenuItem(name, description, price);
        menuItems.add(menuItem);
    }
    
	@Override
    public void removeItem(int position) {
        menuItems.remove(position-1);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new BurgerKingMenuIterator(menuItems);
    }
}
