class employee {
	
	void disemp(int id, String name, int salary, String address){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Address: "+address);
	}

}

class teacher extends employee {
	
	void distea(String subject) {
		System.out.println("Subject: "+subject);
	}
}

public class in2 {
	public static void main(String[] args){
		System.out.println("The Details of Teacher is:");
		teacher one = new teacher();
		one.disemp(1, "amal", 9876, "wayanad");
		one.distea("maths");
	}
}



