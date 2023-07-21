import java.util.*;
	public class CO4_11{
		public static void main (String [] args){
			LinkedList<String> list = new LinkedList<String>();
			Scanner value = new Scanner(System.in);
			int ch;
		do{
			System.out.println("1.Add ");
			System.out.println("2.Remove All ");
			System.out.println("3.Dispaly");
			System.out.print("Select your Option:  ");
			ch = value.nextInt();
			switch(ch){
				case 1:
					String val;
					int v;
					System.out.print("Enter the element: ");
					val = value.next();
					list.add(val);
					break;
				case 2:
					list.clear();
					break;
				case 3:
					System.out.println(list);
					break;
			}
		}
		while(ch !=0);
		}
	}
