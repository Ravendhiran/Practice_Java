package sri;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class writefile_way3_FileoutputStreamWriter {
public static void main (String []args) throws IOException {
	String location="samelocationwithway3_FileoutputStreamWriter.txt";
	String content="way3";
	Path path=Paths.get(location);
	Files.write(path,content.getBytes());
}
}
