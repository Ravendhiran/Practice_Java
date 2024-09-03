package sri;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class writefile_way4_PathFileWriter {
public static void main (String []args) throws IOException {
	String location="samelocationwithway4_PathFileWriter.txt";
	String content="way4";
	FileOutputStream fileoutputstream= new FileOutputStream(location);
	byte[] bytes = content.getBytes();
	fileoutputstream.write(bytes);
	fileoutputstream.close();
	
}
}
