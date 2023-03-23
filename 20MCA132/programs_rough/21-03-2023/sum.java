public class sum{
	
	public void add(int a, int b){
		System.out.println(a+b);
	}
	
	public void add(int a, double d){
		System.out.println(a+d);
	}
	
	public static void main(String[] args){
		sum x = new sum();
		x.add(5,10);
		x.add(5, 5.55);
	}
}