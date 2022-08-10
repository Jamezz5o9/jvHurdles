package dataStructure;

public class ArrayList implements List{

    private boolean isEmpty = true;
    @Override
    public void add(String item) {
        isEmpty = false;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void remove(String item) {

    }

    @Override
    public String get(int id) {
        return null;
    }

    @Override
    public void add(int id, String item) {

    }

    @Override
    public int clear() {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public boolean contains(String anotherItem) {
        return false;
    }
}
