import java.util.*; 
public class LinearProbMain {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Table Size:");
	int size=scan.nextInt();
	System.out.println("Enter the data type of the key to be added in Hash Table");
	System.out.println("1. Integer");
	System.out.println("2.String");
	int kt =scan.nextInt();

	if(kt==1){
		LinearProbing<Integer> lpi= new LinearProbing<Integer> (size);
		while(true){
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Search");
			System.out.println("4. Display");
			System.out.println("5. Exit\nEnter your choice:");
			int choice= scan.nextInt();
			switch (choice) {
			case 1: scan.nextLine();
					System.out.println("Enter the key value:"); 
					int key = Integer.parseInt(scan.nextLine());
					System.out.println("Enter the Name:");
					String name=scan.nextLine();
					System.out.println("Enter the Age:");
					int age=Integer.parseInt(scan.nextLine());
					break;
			case 2:	scan.nextLine();
					System.out.println("Enter the key value:");
					int k1= scan.nextInt();
					break;
			case 3:	scan.nextLine();
					System.out.println("Enter the key value: ");
					int k = scan.nextInt();
					KeyValue n=lpi.get(k);
					break;

			case 4: System.out.printf("%-11s %-14%-11s %s\n", "ID", "Name","Age", "Index");
					System.out.println("");
					int i=0;
					System.out.println();
					break;

			case 5: System.exit(0);
					break;

			default: System.out.println("Wrong Entry in ");
					break;
			}
		}
	}
}
}


	