import java.io.*;
class Main
{
    public static void main(String[] args) throws IOException 
	{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of table");
        int size=Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter an option\n1.Integer, String\n2.String, Double");
        int opt=Integer.parseInt(bufferedReader.readLine());
        switch(opt)
        {
            case 1 :
                SeperateChaining<Integer,String> sc1=new SeperateChaining<>(size);
                Integer key;
                String value;
                do 
				{
                    System.out.println("Operations\n1.Insertion\n2.Deletion\n3.Searching\n4.Display\n5.Exit\nEnter a choice");
                    int ch=Integer.parseInt(bufferedReader.readLine());
                    switch(ch)
                    {
                        case 1 :
                            System.out.println("Enter key");
                            key=Integer.parseInt(bufferedReader.readLine());
                            System.out.println("Enter value");
                            value= bufferedReader.readLine();
                            sc1.insert(key,value);
                            break;
                        case 2 :
                            System.out.println("Enter key to delete");
                            key=Integer.parseInt(bufferedReader.readLine());
                            String v=sc1.delete(key);
                            if(v!=null) 
							{
                                System.out.println(key+" "+v+" deleted");
                            }
                            break;
                        case 3 :
                            System.out.println("Enter key to search");
                            key=Integer.parseInt(bufferedReader.readLine());
                            sc1.search(key);
                            break;
                        case 4 :
                            sc1.display();
                            break;
                        case 5 :
                            return;
                        default :
                            System.out.println("Invalid choice");
                    }
                }while(true);
            case 2 :
                SeperateChaining<String,Double> sc2=new SeperateChaining<>(size);
                String k;
                Double v;
                do 
				{
                    System.out.println("Operations\n1.Insertion\n2.Deletion\n3.Searching\n4.Display\n5.Exit\nEnter a choice");
                    int ch=Integer.parseInt(bufferedReader.readLine());
                    switch(ch)
                    {
                        case 1 :
                            System.out.println("Enter key");
                            k=bufferedReader.readLine();
                            System.out.println("Enter value");
                            v= Double.valueOf(bufferedReader.readLine());
                            sc2.insert(k,v);
                            break;
                        case 2 :
                            System.out.println("Enter key to delete");
                            k=bufferedReader.readLine();
                            Double t=sc2.delete(k);
                            if(t!=null) 
							{
                                System.out.println(k+" "+t+" deleted");
                            }
                            break;
                        case 3 :
                            System.out.println("Enter key to search");
                            k=bufferedReader.readLine();
                            sc2.search(k);
                            break;
                        case 4 :
                            sc2.display();
                            break;
                        case 5 :
                            return;
                        default :
                            System.out.println("Invalid choice");
                    }
                }while(true);
        }
    }
}

class SeperateChaining<K extends Comparable<K>,V> 
{
    int maxSize,currentSize;
    Node<K,V> table[];

    public SeperateChaining(int capacity) 
	{
        maxSize=capacity;
        currentSize=0;
        table=new Node[maxSize];
        for(int i=0;i<maxSize;i++) 
		{
            table[i]=null;
        }
    }

    int size() 
	{
        return currentSize;
    }

    boolean isEmpty() 
	{
        return currentSize==0;
    }

    int hash(K key) 
	{
        return key.hashCode()%maxSize;
    }

    void insert(K key,V value) 
	{
        int home=hash(key);
        Node<K,V> newNode=new Node<>(key,value,null);
        Node<K,V> tempNode=table[home];
        if(table[home]==null) 
		{
            table[home]=newNode;
        }
        else 
		{
            while(tempNode.next!=null) 
			{
                tempNode=tempNode.next;
            }
            tempNode.next=newNode;
        }
        currentSize++;
    }

    V delete(K key) 
	{
        if(isEmpty()) 
		{
            System.out.println("Table is Empty!");
            return null;
        }
        int home=hash(key);
        Node<K,V> previousNode=null;
        Node<K,V> tempNode=table[home];
        while(tempNode!=null && tempNode.key.compareTo(key)!=0) 
		{
            previousNode=tempNode;
            tempNode=tempNode.next;
        }
        if(tempNode!=null) 
		{
            if(tempNode==table[home]) 
			{
                table[home]=tempNode.next;
            }
            else 
			{
                previousNode.next=tempNode.next;
            }
            currentSize--;
            return tempNode.value;
        }
        System.out.println(key + " not present in table");
        return null;
    }

    void search(K key) 
	{
        int home=hash(key);
        Node<K,V> tempNode=table[home];
        while(tempNode!=null && !key.equals(tempNode.key)) 
		{
            tempNode=tempNode.next;
        }
        if(tempNode!=null) 
		{
            System.out.println(tempNode);
        }
        else 
		{
            System.out.println(key+" not found in table");
        }
    }

    void display() 
	{
        Node<K,V> tempNode;
        for(int i=0;i<maxSize;i++) 
		{
            System.out.println("Index : "+i);
            tempNode=table[i];
            if(tempNode==null) 
			{
                System.out.println("No elements present");
            }
            while(tempNode!=null) 
			{
                System.out.println(tempNode);
                tempNode=tempNode.next;
            }
        }
    }
}

class Node<K,V> 
{
    K key;
    V value;
    Node<K,V> next;

    public Node() 
	{
    }

    public Node(K key, V value, Node<K, V> next) 
	{
        this.key = key;
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() 
	{
        return "Key : "+key+" Value : "+value;
    }
}