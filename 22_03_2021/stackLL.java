interface stackInterface<T>
{
	void push(T obj);
	void display();
	boolean isEmpty();
	boolean isFull();
	T pop();
	T top();
}

class Node<T> 
{
	T data;
	Node<T> next;
	Node(T obj)
	{
		data=obj;
		next=null;
	}
}

public class stackLL<T> implements stackInterface<T>
{
	Node<T> head;
	stackLL()
	{
		head=null;
	}
	
	public boolean isEmpty()
	{
		if (head.next==null)
		{
			System.out.println("stack is empty");
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		return false;
	}
	
	public void push (T obj)
	{
		Node<T> newNode = new Node<T>(obj);
		if (head==null) head=newNode;
		else
		{
            Node<T> temp = head;
            head=newNode;
            newNode.next=temp;
 		}
		System.out.println(obj + " has been pushed");
	}
	
	public void display()
	{
        if (!isEmpty())
        {
            Node<T> temp = head;
            System.out.print("elements in stack are : ");
            while (temp!=null)
            {
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }
	}
	
	public T pop() 
	{
        if (!isEmpty())
        {
            T obj=head.data;
            head=head.next;
            System.out.println("element popped : "+ obj);
            return obj;
        }
        else return null;
	}
    
    public T top()
    {
        if (!isEmpty())
        {
            return head.data;
        }
        else return null;
    }
    
    public static void main(String[] args)
    {
        stackLL<Integer> is = new stackLL<Integer>();
        is.push(1);
        is.push(2);
        is.push(3);
        is.push(4);
        is.push(5);
        System.out.println("top element is : "+is.top());
        is.display();
        is.pop();
        System.out.println("top element is : "+is.top());
        is.pop();
        System.out.println("top element is : "+is.top());
        is.display();
        
    }
    
}








