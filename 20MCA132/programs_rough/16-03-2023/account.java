import java.util.*;

public class account {
	int acno;
	String name;
	int balance;
	
	public void get() {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter Account no: ");
		acno = value.nextInt();
		System.out.print("Enter Account name: ");
		name = value.next();
		System.out.print("Enter Account balance: ");
		balance = value.nextInt();
	}
	
	public void out(){
		System.out.println("Account no is: " + acno );
		System.out.println("Account name: " + name);
		System.out.println("Account balance: " + balance);
	}

	
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int size = value.nextInt();
		account array[] = new account[size];
		System.out.println("Enter the elements of Array");
		for (int i=0;i<size;i++)
		{
			array[i] = new account();
			array[i].get();
		}
		System.out.println("The Elements of Array are: ");
		for (int i=0;i<size;i++)
		{
			array[i].out();
		}
		System.out.println("Accounts with balance less than 5000 are:");
		int flag=0;
		for (int i=0;i<size;i++)
		{
			if (array[i].balance > 5000)
			{
				array[i].out();
				flag++;
			}
		}
		if (flag == 0)
		{
			System.out.println("No Accounts have balance less than 5000");
		}
	}
}