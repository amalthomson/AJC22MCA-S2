import java.util.*;
public class largest{
	int a,b,c;
	void largest(int m, int n){
		if(m>n){
			System.out.println(m+" is largest");
		}
		else{
			System.out.println(n+" is largest");
		}
	}
 void largest(int x,int y,int z){
		
		if(x>y && x>z){
			System.out.println(x+" is largest");
		}
		else if(y>x && y>z){
			System.out.println(y+" is largest");
		}
		else {
			System.out.println(z+" is largest");
		}
	}
	public static void main(String[] args){
		LargestN l= new LargestN();
		l.largest(1,2,3);
		l.largest(4,5);
	}
}
