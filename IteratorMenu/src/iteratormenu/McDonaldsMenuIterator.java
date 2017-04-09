package iteratormenu;

public class McDonaldsMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public McDonaldsMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return !(position >= items.length || items[position] == null);
    }
}
