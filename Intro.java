package pkg_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Intro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\balaji\\Desktop\\commons\\commons-io-2.6\\text file\\text1.txt");
		
		String x = FileUtils.readFileToString(file, "UTF-8");
		
		System.out.println(x);
		

	}

}
