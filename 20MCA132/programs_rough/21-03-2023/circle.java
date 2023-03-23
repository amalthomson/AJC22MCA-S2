public class circle{
	
	public void area(int radius){
		System.out.println("Area is: " + 3.14 * radius  * radius );
	}
	
	public void area(double radius) {
		System.out.println("Area of Circle is: " + 3.14 * radius  * radius );
	}
	
	public void area(int a, int b){
		System.out.println("Area is: " + a*b );
	}
	
	public void area(int c, float d){
		System.out.println("Area is: " + c*d );
	}
	
	public void area(float e, float f){
		System.out.println("Area of Triangle: " + 0.5*e*f );
	}
	
	public static void main(String[] args){
		circle x = new circle();
		x.area(5);
		x.area(7.5);
		x.area(10, 20);
		x.area(7, 5.5f);
		x.area(2.2f, 3.5f);
		
	}
}