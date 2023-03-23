public class sum{
	int a,b;
	float c,d;
	
	public void add(int a, int b){
		System.out.println(a+b);
	}
	
	public void add(int c, float d){
		System.out.println(a+b);
	}
	
	public static void main(String[] args){
		sum x = new sum();
		x.add(5,10);
		x.add(5, 5.55);
	}
}