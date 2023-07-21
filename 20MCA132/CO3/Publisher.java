import java.util.*;
class Publisher{
	String pname;
	Publisher(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Publishers name: ");
		pname=sc.next();
	}
	public static void main(String[] args){
		int i,n,n1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of literature books: ");
		n=sc.nextInt();
		literature[] l=new literature[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Details of book "+(i+1));
			l[i]=new literature();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Details of literature book "+(i+1));
			l[i].ldisp();
		}
		System.out.print("Enter the number of fiction books: ");
		n1=sc.nextInt();
		fiction[] f=new fiction[n1];
		for(i=0;i<n1;i++)
		{
			System.out.println("Details of book "+(i+1));
			f[i]=new fiction();
		}
		for(i=0;i<n1;i++)
		{
			System.out.println("Details of fiction book "+(i+1));
			f[i].fdisp();
		}
		
	}
}
class book extends Publisher{
	String author,name;
	int price;
	book(){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter book name: ");
		name=sc.next();
		System.out.print("Enter author name: ");
		author=sc.next();
		System.out.print("Enter the price: ");
		price=sc.nextInt();
	}
}
class literature extends book{
	 void ldisp(){
		System.out.println("Book Name:"+name); 
		System.out.println("Author Name: "+author);
		System.out.println("Price: "+price);
		System.out.println("Publisher Name:"+pname);
	 }	
}
class fiction extends book{
	 void fdisp(){
		System.out.println("Book Name:"+name);
        System.out.println("Author Name: "+author);
		System.out.println("Price: "+price);
        System.out.println("Publisher Name:"+pname);		
	 }	
}