package librarysystem.main;

import java.io.FileWriter;
import java.io.IOException;

public class inputoutputpractice {

	public static void main(String[] args) {
		String filepath = "C:/Users/Yoon/test.txt";
		FileWriter fw;
		try {
			fw = new FileWriter(filepath, true);
			for (int i=0; i<10; i++) {
				fw.write("안녕하세요. 김동윤입니다.\n");
			}
			fw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
	}

}
