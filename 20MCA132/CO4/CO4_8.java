import java.util.*;
public class CO4_8{
	public static void main( String args[]){
		int pos,ch;
		Scanner obj =new Scanner(System.in);
		Stack<String> sta =new Stack<String>();
		do{
			System.out.println("STACK");
			System.out.println("1.ADD ");
			System.out.println("2.REMOVE ");
			System.out.println("3.DISPLAY ");
			System.out.print("Select your Option: ");
			ch=obj.nextInt();
		switch(ch){
			case 1:
				System.out.print("Enter the Element to be inserted :- ");
				sta.add(obj.next()) ;
				System.out.println("Inserted to the Stack :- ");
				break;
			case 2:
				System.out.print("Enter the position of  element removed from stack: ");
				pos=obj.nextInt();
				sta.remove(pos);
				break;
			case 3:
				System.out.println(sta);
		}
		} while(ch!=0);
	}
}