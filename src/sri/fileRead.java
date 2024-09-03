package sri;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileRead {
public static void main(String []args) throws IOException {
	String location="samelocationwithway1_FileWriter.txt";
	FileReader readfile=new FileReader(location);
	BufferedReader reader= new BufferedReader(readfile);
	String read;
//	System.out.println(read);
	while((read=reader.readLine())!=null) {
		System.out.println(read);
	}
}
}
