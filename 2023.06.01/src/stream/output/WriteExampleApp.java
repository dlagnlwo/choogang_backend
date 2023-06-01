package stream.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExampleApp {
	public static void main(String[] args) {
		try {
			//OutputStream은 폴더를 만들지 않음.
			OutputStream os = new FileOutputStream("c:/Temp/test3.db");
			
			byte a[] = {10, 20, 30, 40, 50};
			
//			os.write(a, 0, 3); //0부터 3개
			os.write(a, 1, 3); //1부터 3개
			System.out.println("파일이 생성되었습니다.");
			
			
			os.flush(); //버퍼의 남아있는 내용물 버리기
			os.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
