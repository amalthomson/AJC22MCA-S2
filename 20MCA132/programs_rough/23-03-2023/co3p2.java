import java.util.Scanner;

class Employee {
    int e_id;
    String e_name, e_address;
    double e_sal;

    Employee(int id, String name, double sal, String address) {
        e_id = id;
        e_name = name;
        e_address = address;
        e_sal = sal;
    }

    void display() {
        System.out.println("Employee name = " + e_name);
        System.out.println("employee salary = " + e_sal);
        System.out.println("employee address = " + e_address);
    }
}

class Teacher extends Employee {
    String t_dept, t_sub;

    Teacher(String dept, String sub, String name, int id, String address, double sal) {
        super(id, name, sal, address);
        t_dept = dept;
        t_sub = sub;
    }

    void display() {
        System.out.println("Department = " + t_dept);
        System.out.println("Subject = " + t_sub);
        System.out.println("Employee id = " + e_id);
        System.out.println("Employee name = " + e_name);
        System.out.println("employee salary = " + e_sal);
        System.out.println("employee address = " + e_address);
    }
}

public class co3p2 {
    public static void main(String[] args) {
        int count, id;
        String name, dept, sub, address;
        double sal;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of Teachers");
        count = s.nextInt();

        Teacher[] obj = new Teacher[count];
        for (int i = 0; i < count; i++) {
            System.out.println("enter the Emp name");
            name = s.next();
            System.out.println("enter the id");
            id = s.nextInt();
            System.out.println("enter the address");
            address = s.next();
            System.out.println("enter the salry");
            sal = s.nextInt();
            System.out.println("enter the department");
            dept = s.next();
            System.out.println("enter the subject");
            sub = s.next();
            obj[i] = new Teacher(dept, sub, name, id, address, sal);
        }

        for (int i = 0; i < count; i++) {
            obj[i].display();
        }
    }
}