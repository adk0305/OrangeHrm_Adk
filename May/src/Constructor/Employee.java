package Constructor;

public class Employee {
	int eid;
	String ename;
	String eaddress;
	
	public Employee(int a, String b) {
		eid = a;
		ename= b;
	}

	public Employee(int eid, String ename, String eaddress) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
	}

	
	}
	
		
	


