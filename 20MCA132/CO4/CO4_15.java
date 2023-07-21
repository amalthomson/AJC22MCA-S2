import java.util.*;
public class CO4_15{
	public static void main(String args[]){
		Scanner obj = new Scanner (System.in);
		Set <Integer> Srt =new LinkedHashSet<Integer>();
		Set <Integer> Srt2 =new LinkedHashSet<Integer>();
		Set <Integer> Union =new LinkedHashSet<Integer>();
		Set <Integer> inter =new LinkedHashSet<Integer>();
		int n,u,l;
		System.out.print("Enter the Number of elements First set: " );
		n=obj.nextInt();
		for (int i =0 ; i<n;i++){
			System.out.print("Enter the elements: " );
			Srt.add(obj.nextInt());
		}
		System.out.println(Srt);
		System.out.print("Enter the Number of elements second set: " );
		l=obj.nextInt();
		for (int i =0 ; i<l;i++){
			System.out.print("Enter the elements: " );
			Srt2.add(obj.nextInt());
		}
		System.out.println(Srt2);
		Union=Srt;
		System.out.println("Union : " + Union.addAll(Srt2));
			System.out.println(Union);
		inter=Srt;
		System.out.println("Intrsection : " + inter.retainAll(Srt2));
		System.out.println(inter);
		System.out.println("Differeance : " + Srt.removeAll(Srt2));
		System.out.println(Srt);
	}
}