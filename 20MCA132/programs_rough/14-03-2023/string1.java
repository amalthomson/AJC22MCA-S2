import java.util.*;

public class string1 {
	public static void main (String[] args){
		Scanner value = new Scanner(System.in);
		String var1 = value.nextLine();
		String var2 = value.nextLine();
		String var3 = value.nextLine();
		
		System.out.println(var1.compareTo(var2));
		System.out.println(var1.compareTo(var3));
	}
}