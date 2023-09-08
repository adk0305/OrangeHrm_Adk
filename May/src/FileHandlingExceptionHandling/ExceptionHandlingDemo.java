package FileHandlingExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		String FilePath ="./src/FileHandlingExceptionHandling/TestData1";
		System.out.println("Ajay");
		try {
			FileReader reader = new FileReader(FilePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not found,pls find it");
		
		}finally {
			
			System.out.println("closing the connection");
		}
	}

}

//
//Exception-unexpected errors
//Try-risky errors
//catch block-what to do when there is exception
//finally-close the connection either way