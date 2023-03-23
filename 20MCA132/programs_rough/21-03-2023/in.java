class one {
	void display(){
		System.out.println("CLASS ONE");
	}
}

class two extends one {
	void print() {
		System.out.println("CLASS TWO");
	}
}

class three extends two {
	void out() {
		System.out.println("CLASS THREE");
	}
}

public class in {
	public static void main(String[] args){
		three object = new three();
		object.display();
		object.print();
		object.out();
	}
	
}