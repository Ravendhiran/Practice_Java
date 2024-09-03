package sri;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writefile_way2_BufferedWriter {
public static void main (String []args) throws IOException {
	String location="samelocationwithway2_BufferedWriter.txt";
	String content="way2";
	FileWriter writer=new FileWriter(location);
	BufferedWriter bufferedwriter=new BufferedWriter(writer);
	bufferedwriter.write(content);
	bufferedwriter.close();
}
}
