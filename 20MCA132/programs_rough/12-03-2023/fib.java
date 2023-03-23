public class fib {
	public static void main (String[] args) {
		
		int num = 10;
		int i = 0;
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		System.out.println(n1);
		System.out.println(n2);
		
		while(i<num) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			i++;
			
		System.out.println(n3);
		}
		
		
	}
}