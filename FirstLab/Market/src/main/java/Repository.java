import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repository<T> {
    private final List<T> collection = new ArrayList<>();

    public Repository(List<T> list)
    {
        Collections.copy(collection, list);
    }

    public void addItem(T item) {
        collection.add(item);
    }

    public void removeItem(T item) {
        collection.remove(item);
    }

    public void updateItem(T oldItem, T newItem) {
        int index = collection.indexOf(oldItem);
        if (index != -1) {
            collection.set(index, newItem);
        } else {
            System.out.println(oldItem + " not found in the collection.");
        }
    }

    public List<T> getAllItems() {
        return collection;
    }
}
