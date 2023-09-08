package Abstraction;

//import java.security.PublicKey;

public class Car implements Honda{
	
	String st = "Alto";
	String ng = "VX";
	String ad="maruti";
	String result;
	//int i = 2010;
	
	public void City() {

		result = st.concat(ng);
		 ad = ad.concat(result);
		System.out.println(ad);
		
	}
	
	

}
