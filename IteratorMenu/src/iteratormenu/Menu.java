package iteratormenu;

public interface Menu {
    public Iterator createIterator();
	public void addItem(String name, String description, float price);
	public void removeItem(int position);
}
