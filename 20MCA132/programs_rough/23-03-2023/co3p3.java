import java.util.Scanner;
class Person1{
    int p_age;
    String p_name,p_address,p_gender;
    Person1(String name,String address, int age, String gender){
        p_age=age;
        p_name=name;
        p_address=address;
        p_gender=gender;
    }   
}
class Employee1 extends Person1{
    String e_c_name, e_qualification;
    int e_id;
    double e_sal;
    Employee1(int id, String qualification, String comany_name, double sal, String name,String address, int age, String gender){
        super(name,address,age,gender);
        e_c_name=comany_name;
        e_qualification=qualification;
        e_id=id;
        e_sal=sal;

    }
    
}
class Teacher1 extends Employee1{
    String t_dept,t_sub;
    int t_id;
    Teacher1(String dept, String sub, int tr_id, int id, String qualification, String comany_name, double sal, String name,String address, int age, String gender){
        super(id, qualification, comany_name, sal, name, address, age, gender);
        t_dept=dept;
        t_sub=sub;
        t_id=tr_id;
    }

    void display(){
        System.out.println("person Name ="+p_name);
        System.out.println("person gender ="+p_gender);
        System.out.println("person age ="+p_age);
        System.out.println("person address ="+p_address);
        System.out.println("Emp id ="+e_id);
        System.out.println("Emp qualification ="+e_qualification);
        System.out.println("Emp sal ="+e_sal);
        System.out.println("Emp company name ="+e_c_name);
        System.out.println("tchr id ="+t_id);
        System.out.println("tchr sub ="+t_sub);
        System.out.println("tchr dept ="+t_dept);


    }
}

public class co3p3 {
    public static void main(String[] args){
        int count,e_id,t_id,p_age;
        String p_name,t_dept,t_sub,p_address,p_gender,qualification,c_name;
        double sal;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of Teachers");
        count=s.nextInt();

        Teacher1 [] obj=new Teacher1[count];
        for(int i=0;i<count;i++){
            System.out.println("enter the Emp name");
            p_name=s.next();
            System.out.println("enter the Emp age");
            p_age=s.nextInt();
            System.out.println("enter the Emp address");
            p_address=s.next();
            System.out.println("enter the Emp gender");
            p_gender=s.next();

            System.out.println("enter the id");
            e_id=s.nextInt();
            System.out.println("enter the company name");
            c_name=s.next();
            System.out.println("enter the salry");
            sal=s.nextDouble();
            System.out.println("enter the qualification");
            qualification=s.next();

            System.out.println("enter the subject");
            t_sub=s.next();
            System.out.println("enter the dept");
            t_dept=s.next();
            System.out.println("enter the tchr id");
            t_id=s.nextInt();
            
            obj[i]=new Teacher1(t_dept,t_sub,t_id, e_id,qualification,c_name, sal,p_name,p_address, p_age,p_gender);
        }

        for(int i=0;i<count;i++){
            obj[i].display();
        }
    }
}