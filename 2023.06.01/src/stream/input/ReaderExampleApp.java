package stream.input;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExampleApp {
	public static void main(String[] args) throws IOException{
		String filepath = "c:/temp/test7.txt";
		Reader reader = new FileReader(filepath);
		
		while(true) {
			//short, int형은 음수를 포함하므로 char타입을 표현할 수 없음
			//해결방법은 일단 int형으로 저장하고 출력할때 char로 강제 형변환하면됨
			int readCount = reader.read();
			if(readCount == -1) { //파일의 끝 : -1
				break; 
			}
			System.out.print((char)readCount + " ");
		}
		
		reader.close();
	}
}
