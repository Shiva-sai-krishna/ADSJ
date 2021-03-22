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
	
	boolean isEmpty()
	{
		if (head.next==null)
		{
			System.out.println("stack is empty");
			return true;
		}
		return false;
	}
	
	boolean isFull()
	{
		return false;
	}
	
	void push (T obj)
	{
		Node<T> newNode = new Node(obj);
		if (head==null) head=newNode;
		else
		{
			Node<T> temp = head;
			while (temp.next!=null) temp=temp.next;
			temp.next=newNode;
 		}
		System.out.println(obj + "has been pushed");
	}
	
	

}