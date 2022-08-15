package dataStructure;

public interface List {
    void add(String item);
    void remove(int id);
    String get(int id);
   void add(int id, String item);
   int size();
   boolean isEmpty();

    boolean contains(String anotherItem);
}
