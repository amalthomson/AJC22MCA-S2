import java.util.*;
class CO4_10{
 	public static void main(String args[]){
		Scanner value = new Scanner(System.in);
		int ch;
		String str;
		int n;
		ArrayList<String> list = new ArrayList<String>();
		do{
			System.out.println("1.Add ");
            System.out.println("2.Remove ");
            System.out.println("3.Display the element in n=th index ");
            System.out.println("4.Display ");
            System.out.println("5.Remove All ");
            System.out.print("Select your Option:  ");
            ch=value.nextInt();
		switch(ch){
			case 1:
                System.out.print("Enter the element to be inserted: ");
                str=value.next();
                list.add(str);
				break;
			case 2:
				System.out.print("Enter index of the element  to be removed: ");
				n=value.nextInt();
				list.remove(n);
				break;
			case 3:
				System.out.print("Enter the index of element: ");
				n=value.nextInt();
				System.out.println(list.get(n));
				break;
			case 5:
                list.removeAll(list);
				break;
			case 4 :
				System.out.println(list);
				break;
	}
		} 
		while(ch!=0);
	}
}
