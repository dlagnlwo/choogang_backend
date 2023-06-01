package stream.input;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3App {
	public static void main(String[] args) throws Exception{
		String filepath = "c:/temp/test3.db";
		InputStream is = new FileInputStream(filepath);
		byte[] buffer = new byte[5];
		
		int readByteSize = is.read(buffer, 2, 3); //2번째부터 3개
		if(readByteSize != -1) {
			for(int i = 0; i < buffer.length; i++) {
				int b = buffer[i];
				System.out.println(b);
			}
		}
		is.close();
		
	}
}
