package stream.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExampleApp {
	public static void main(String[] args) {
		try {
			String filepath = "c:/temp/test1.db";
			InputStream is = new FileInputStream(filepath);
			boolean isRun = true;
			while(isRun) {
				int data = is.read();//output은 os.write()
				//파일의 끝이면 읽기 스탑.
				if(data == -1) {
					break;
				}
				System.out.println(data);
				is.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			
		}
		
	}
}
