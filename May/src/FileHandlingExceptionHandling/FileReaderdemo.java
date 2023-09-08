package FileHandlingExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderdemo {
	
	
public static void main(String[] args) throws IOException {
	String FilePath ="./src/FileHandlingExceptionHandling/TestData";
	FileReader reader = new FileReader(FilePath);
//	System.out.println((char)reader.read());
	int i=0;
	while((i = reader.read()) != -1){
		System.out.print((char)i);
		
	}
	reader.close();
}
}
	 