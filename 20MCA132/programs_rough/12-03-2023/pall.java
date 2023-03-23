public class pall {
	public static void main(String[] args){
		int num = 12321;
		int num1 = num;
		int sum=0;
		int rem=0;
		
		System.out.println("Number: " + num);
	
		
		while(num>0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num/10;
		}
		
		if (num1 == sum) {
			System.out.println("Palindrome Possible");
		}
		else {
			System.out.println("Palindrome not Possible");
		}
			
		
	}
}