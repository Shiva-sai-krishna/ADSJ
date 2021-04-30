public class pair <K extends Comparable<K>,V>
{
    K key;
    V value;
    pair(K k,V v)
    {
        key=k;
        value=v;
    }
    public String toString()
    {
        return "key : "+key+"  value : "+value+"\n";
    }
}
