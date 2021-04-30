public class pairNode <K extends Comparable<K>,V>
{
    pair<K,V> data;
    pairNode<K,V> next;
    pairNode(pair<K,V> d,pairNode<K,V> n)
    {
        data=d;
        next=n;
    }
}
