package iteratormenu;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public ArrayListIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public Object next() {
        Object object = items.get(position);
        position++;
        return object;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }
}
