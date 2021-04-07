interface queue<T>
{


    void enqueue(T obj);
    void dequeue();
    void display();
    boolean isEmpty();
    boolean isFull();
}

class Node<T> 
{
    T data;
    Node<T> next;
    Node(T d)
    {
        next=null;
        data=d;
    }
}

public class queueLL<T> implements queue<T>
{
    Node<T> head=null;
    Node<T> top=null;
    
    public void enqueue(T obj)
    {
        if (top==null) head=top=new Node<T>(obj);
        else 
        {
            top.next=new Node<T>(obj);
            top=top.next;
        }
        System.out.println("enqueued : "+obj);
    }
    
    public void dequeue()
    {
        if (!isEmpty())
        {
            System.out.println("element dequeued : "+head.data);
            if (top==head )
            {
                top=head=null;
                return;
            }
            head=head.next;
        }
    }
    
    public void display()
    {
        if (!isEmpty())
        {
            Node<T> temp = head;
            System.out.println("elements in queue are : ");
            while (temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public boolean isEmpty()
    {
        if (head==null && top==null)
        {
            System.out.println("the queue is empty");
            return true;
        }
        return false;
    }
    public boolean isFull()
    {
        return false;
    }
    public static void main(String[] args)
    {
        queueLL<Integer> q=new queueLL<Integer>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        
        q.display();
        
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
    }
}










