package programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws IOException {
		
		File ff = new File("/home/abhishek/Desktop/abc.txt");
		
		FileReader fr = new FileReader(ff);
		BufferedReader br = new BufferedReader(fr);
		String content = br.readLine();
		while(content!=null)
		{
			System.out.println(content);
			
			content = br.readLine();
		}

	}

}
