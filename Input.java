package Nischal;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Input {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;
		String path1 = "C:\\Users\\Srinischal.Thiparani\\eclipse-workspace\\Nischal\\Input.txt";
		String path2 = "C:\\Users\\Srinischal.Thiparani\\eclipse-workspace\\Nischal\\src\\nischal\\Output.txt";
		try {
			fr = new FileReader(path1);
			fw = new FileWriter(path2);
			int temp;
			while ((temp = fr.read()) != -1) {
				fw.write(temp);
			}
		} catch (Exception e) {
			System.out.println("IO exception");
		} finally {
			fr.close();
			fw.close();
		}
	}
}