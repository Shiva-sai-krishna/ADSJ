import java.util.*;
interface queue<T>
{
  void enqueue(T obj);
  T dequeue();
  void display();
  Boolean isEmpty();
  Boolean isFull();
}

public class queueLL<T> implements queue<T>
{
  LinkedList<T> ll;
  queueLL() {ll=new LinkedList<T>();}
  public void enqueue(T obj){System.out.println("added element : "+obj);ll.addLast(obj);}
  public T dequeue(){if (!isEmpty()) return ll.removeFirst();return null;}
  public void display(){System.out.println("stack : "+ll);}
  public Boolean isEmpty(){return ll.size()==0;}
  public Boolean isFull(){return false;}
  public static void main(String[] args)
  {
    queueLL<String> q=new queueLL<String>();
    q.enqueue("a");
    q.enqueue("b");
    q.enqueue("c");
    q.display();
    System.out.println("element dequeued :"+q.dequeue());
    q.display();
  }
}
