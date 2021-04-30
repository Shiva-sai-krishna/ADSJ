public interface dictionary <K extends Comparable<K>,V>
{
    void insert(K key,V value);
    void delete(K key);
    void search(K key);
    void display();
    int size();
    boolean isEmpty();
}
