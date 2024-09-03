package sri;

import java.io.FileWriter;
import java.io.IOException;

public class writefile_way1_FileWriter {
public static void main (String []args) throws IOException {
	String location="samelocationwithway1_FileWriter.txt";
	String content="way1";
	FileWriter writer=new FileWriter(location);
	writer.write(content);
	writer.close();
}
}
