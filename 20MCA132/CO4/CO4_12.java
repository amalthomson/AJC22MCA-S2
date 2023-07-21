import  java.util.*;
public class CO4_12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter the Size of Stack: " );
        int n = obj.nextInt();
        for (int i =0 ; i<n;i++){
			System.out.print("Enter the elements: " );
			st.add(obj.nextInt());
		}
        System.out.println("Stack = "+st);
        System.out.print("Enter the position: ");
        int x = obj.nextInt();
        st.remove(x);
        System.out.println("Stack = "+st);
    }
}

