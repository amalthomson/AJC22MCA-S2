package Arithmetic; 
import java.util.*;
public class basic implements operations{
    double a,b,ad,dif,mult,div;
    public void input(){
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a=ab.nextInt();
        b=ab.nextInt();
    }
    public void add(){
    ad=a+b;
    System.out.println("Sum is "+ad);
    }
    public void substract(){
    dif=a-b;
    System.out.println("Difference is "+dif);
    }
    public void multiply(){
    mult=a*b;
    System.out.println("Product is "+mult);
    }
    public void division(){
    div=a/b;
    System.out.println("Quotient is "+div);
    }
    public static void main(String[] args){
        basic o=new basic();
        o.input();
        o.add(); 
        o.substract();
        o.multiply();
        o.division();
    }
}