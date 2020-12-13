package objectclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleBag {

    private int cursor;
    private List<Object> items = new ArrayList<>();

    public SimpleBag() {
        beforeFirst();
    }

    public void putItem(Object item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public int size() {
        return items.size();
    }

    public boolean hasNext() {
        return cursor + 1 < size() && !isEmpty();
    }

    public void beforeFirst() {
        cursor = -1;
    }

    public Object next() {
        if (hasNext()) {
            cursor++;
            return items.get(cursor);
        }
        return null;
    }

    public boolean contains(Object item) {
        for (Object obj : items) {
            if (obj.toString().equals(item.toString())) {
                return true;
            }
        }
        return false;
    }

    public int getCursor() {
        return cursor;
    }
}
