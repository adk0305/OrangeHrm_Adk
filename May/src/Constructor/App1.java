package Constructor;

public class App1 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Devika");
		e1.eid=1;
		e1.ename="devika";
		System.out.println(e1.eid);
		System.out.println(e1.ename);
	
	
	Employee e2 = new Employee(2, "shona", "yui");
	e2.eid=2;
	e2.ename="shona";
	e2.eaddress="yui";
	System.out.println(e2.eid);
	
	
	

	

	}

}