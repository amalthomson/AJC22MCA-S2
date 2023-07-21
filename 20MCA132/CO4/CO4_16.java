import java.util.* ;
public class CO4_16 {  
    public static void main(String[] argv)  {   
        Set<String> set1 = new HashSet<String>();  
        set1.add("Paul");  
        set1.add("Donal");  
        set1.add("William");  
        set1.add("Johnson");  
        set1.add("Emma");  
        System.out.println("The values in the 1st set are: "+ set1);  
        System.out.println();  
        System.out.println("The size of the 1st set is: "+ set1.size());  
        Set<String> set2 = new HashSet<String>();  
        set2.add("Paul");  
        set2.add("Johnson");  
        set2.add("Donal");  
        set2.add("Emma");  
        set2.add("William");  
        System.out.println("The values in the 2nd set are: "+ set2);  
        System.out.println();  
        System.out.println("The size of the 2nd set is: "+ set2.size());  
        boolean result = set1.equals(set2);  
        if(result) {  
            System.out.println("Set1 and Set2 are equal.");  
        }else {  
            System.out.println("Set1 and Set2 are not equal.");  
        }  
    }  
}  