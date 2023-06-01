package stream.input;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2App {
	public static void main(String[] args) throws Exception{
		String filepath = "c:/temp/test2.db";
		InputStream is = new FileInputStream(filepath);
		
		byte[] buffer = new byte[2];
		
		while(true) {
			//0부터 3개
//			int readByteSize = is.read(buffer,0,3);
			int readByteSize = is.read(buffer); //끝까지저장해라
			if(readByteSize == -1) {
				break;
			}
			for (int i = 0; i < readByteSize; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}
}
