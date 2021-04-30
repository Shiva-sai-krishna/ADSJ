import java.util.*;
public class SortedChain <K extends Comparable<K>,V> implements dictionary<K,V>
{
    pairNode<K,V> head,temp,prev;
    Integer size;
    
    SortedChain()
    {
        head=null;
        size=0;
    }
    
    public int size()
    {
        return size;
    }
    
    public boolean isEmpty()
    {
        if (head==null)
        {
            System.out.println("dictionary is empty");
            return true;
        }
        return false;
    }
    
    public void display()
    {
        if (!isEmpty())
        {
            temp=head;
            System.out.println("elements in dictionary are ");
            while (temp!=null) 
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    
    public void search(K key)
    {
        if (!isEmpty())
        {
            temp=head;
            while (temp!=null)
            {
                if (temp.data.key.compareTo(key)<0) temp=temp.next;
                else break;
            }
            if (temp==null) System.out.println("key not found");
            else if (key.equals(temp.data.key)) System.out.println("key found\n"+temp.data);
            else System.out.println("key not found");
        }
    }
    
    public void delete(K key)
    {
        if (!isEmpty())
        {
            if (head.data.key.equals(key)) 
            {
                System.out.println("key deleted");
                head=head.next;
                size--;
            }
            else
            {
                prev=head;
                temp=head.next;
                while (temp!=null)
                {
                    if (temp.data.key.compareTo(key)<0)
                    {
                        temp=temp.next;
                        prev=prev.next;
                    }
                    else break;
                }
                if (temp==null) System.out.println("key not found");
                else if (temp.data.key.compareTo(key)>0) System.out.println("key not found");
                else
                {
                    System.out.println("key deleted");
                    prev.next=temp.next;
                    size--;
                }
            }
        }
    }
    
    public void insert(K key,V value)
    {
        pair<K,V> p = new pair<K,V>(key,value);
        if (size==0) head=new pairNode<K,V>(p,null);
        else
        {
            temp=head;
            if (key.compareTo(head.data.key)<0)
            {
                head=new pairNode<K,V>(p,temp);
            }
            else
            {
                prev=head;
                temp=head.next;
                while (temp!=null)
                {
                    if (key.compareTo(temp.data.key)>0)
                    {
                        temp=temp.next;
                        prev=prev.next;
                    }
                    else break;
                }
                prev.next=new pairNode<K,V>(p,temp);
            }
        }
        size++;
    }
    
}






















