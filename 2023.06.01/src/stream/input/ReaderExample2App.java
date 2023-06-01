package stream.input;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample2App {
	public static void main(String[] args) throws IOException {
		String filepath = "c:/temp/test8.txt";
		Reader reader = new FileReader(filepath);
		char[] buffer = new char[100];

//		while(true) {
//			int readCharSize = reader.read(buffer);
//			//파일처리하기전 파일의 끝인가를 검사해야함.
//			//파일의 끝은 -1로 약속되있음.
//			if(readCharSize == -1) {
//				break;
//			}
//			
//			for(int i = 0; i < readCharSize; i++) {
//				System.out.print(buffer[i] + " ");
//			}
//		}
		//////////////////////////////////
		
		int readCharSize = reader.read(buffer, 2, 3);
		if(readCharSize == -1) {
			
		} else {
			for(int i = 0; i < readCharSize; i++) {
				System.out.print(buffer[i] + " ");
			}
		}
		
		reader.close();
	}
}
