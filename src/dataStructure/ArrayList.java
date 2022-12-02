package dataStructure;

import java.util.Objects;

public class ArrayList implements List{
    private boolean isEmpty = true;
    private int count;
    private String[] elements = new String[5];

    @Override
    public void add(String item) {
        isEmpty = false;
        elements[count] = item;
        count++;
    }

    @Override
    public void remove(int id) {
        elements[id] = null;
        count--;
    }

    @Override
    public String get(int id) {
        return elements[id];
    }


    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public boolean contains(String anotherItem) {
        for (int i = 0; i < size(); i++) {
            if (Objects.equals(elements[i], anotherItem)) {
                return true;
            }

        }
        return false;

    }


}
