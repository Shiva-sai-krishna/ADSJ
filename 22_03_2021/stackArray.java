import java.util.Scanner;
public class stackArray
{
  int[] stack;
  int size,head;
  Scanner sc;

  stackArray()
  {
    System.out.println("enter the size of stack");
    sc=new Scanner(System.in);
    size=Integer.valueOf(sc.nextLine());
    stack = new int[size];
    head=0;

  }
  void display()
  {
    System.out.print("elements in stack are : ");
    for (int i=0;i<head;i++)
      System.out.print(stack[i]+" ");
    System.out.println();
  }
  void push()  {
    if (head==size) System.out.println("the stack is full");
    else{
      System.out.println("enter the element to be pushed");
      stack[head++]=Integer.valueOf(sc.nextLine());
    }
  }
  void pop(){
    if (head==0) System.out.println("the stack is empty");
    else System.out.println("popped "+ stack[--head]);
  }
  void top(){
    if (head==0) System.out.println("the stack is empty");
    else System.out.println("element in the top is : "+stack[head-1]);
  }

  public static void main(String[] args) {
    stackArray stack=new stackArray();
    System.out.println("\t\tMenu\n1) push\n2) pop\n3) top\n4) display\n5) quit");
    int choice=0;
    do
    {
      System.out.println("enter your choice");
      choice=Integer.valueOf(stack.sc.nextLine());
      switch (choice)
      {
        case 1:stack.push();break;
        case 2:stack.pop();break;
        case 3:stack.top();break;
        case 4:stack.display();break;
        case 5:break;
        default :
          System.out.println("invalid choice");
          break;
      }
    }while(choice!=5);
  }
}
