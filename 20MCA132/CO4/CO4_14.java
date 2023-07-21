import java.util.*;
import java.util.Deque;
public class CO4_14{
	public static void main (String [] args){
		Scanner value = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i=0; i<5; i++){
			System.out.print("Enter the elements: ");
			int x = value.nextInt();
			deque.addFirst(x);
		}
		System.out.println(deque);
		int frist = deque.removeFirst();
		int last = deque.removeLast();
		System.out.println(deque);
		System.out.println("Frist : " +	frist + "\n"+"Last " + last);
		}	
}
