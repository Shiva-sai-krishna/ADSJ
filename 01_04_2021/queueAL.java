import java.util.*;
interface queue<T>
{
  void enqueue(T obj);
  T dequeue();
  void display();
  Boolean isEmpty();
  Boolean isFull();
}

public class queueAL<T> implements queue<T>
{
  ArrayList<T> al;
  queueAL() {al=new ArrayList<T>();}
  public void enqueue(T obj){System.out.println("added element : "+obj);al.add(obj);}
  public T dequeue(){if (!isEmpty()) return al.remove(0);return null;}
  public void display(){System.out.println("stack : "+al);}
  public Boolean isEmpty(){return al.size()==0;}
  public Boolean isFull(){return false;}
  public static void main(String[] args)
  {
    queueAL<String> q=new queueAL<String>();
    q.enqueue("a");
    q.enqueue("b");
    q.enqueue("c");
    q.enqueue("d");
    q.display();
    System.out.println("element dequeued :"+q.dequeue());
    q.display();
  }
}
