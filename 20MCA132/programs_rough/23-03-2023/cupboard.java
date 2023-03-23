import java.util.*;
class box{
	int l,w,h;
	void get(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length");
		l=sc.nextInt();
		System.out.println("Enter width");
		w=sc.nextInt();
		System.out.println("Enter height");
		h=sc.nextInt();
	}
}
class cupboard extends box{
	int n;
	void get1(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of shelves");
		n=sc.nextInt();
	}
	void display(){
		System.out.println("Length of box: "+l);
		System.out.println("Width of box: "+w);
		System.out.println("Height of box: "+h);
		System.out.println("No.of shelves: "+n);
	}
	public static void main(String[] args){
        cupboard s=new cupboard();
        s.get();
        s.get1();
        s.display();
	}
}	