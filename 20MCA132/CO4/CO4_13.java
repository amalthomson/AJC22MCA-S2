import java.util.*;
class CO4_13{
	public static void main(String args[]){
		Scanner value = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int ch;
		do{
			System.out.println("1.Add ");
			System.out.println("2.Peek ");
			System.out.println("3.Poll ");
			System.out.print("Select your Option:  ");
			ch = value.nextInt();
			switch(ch){
				case 1:
					int val;
					System.out.print("Enter the element: ");
					val = value.nextInt();
					pq.add(val);
					break;
				case 2:
					System.out.println(pq.peek());
					break;
				case 3:
					System.out.println(pq.poll());
					break;
			}
		}
		while(ch !=0);
	}
}
