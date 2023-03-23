
public class cons {
	int id;
	String name;
	
	cons(int x, String y){
		id=x;
		name=y;
		System.out.println("ID is: " + x);
		System.out.println("Name is: " + y);
	}
	
	public static void main(String[] args){
		cons abc = new cons(1, "amal");
	}
}