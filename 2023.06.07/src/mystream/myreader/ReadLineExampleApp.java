package mystream.myreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExampleApp {
	public static void main(String[] args) throws Exception {
		//문자입출력스트림은 Reader / Writer
		//읽어오기
		Reader reader = new FileReader("c:/temp/language.txt");
		//읽기속도 향상
		BufferedReader br = new BufferedReader(reader);
		
		//파일 내용 가져오기
		while(true) {
			String data = br.readLine();
			if(data == null) break;
			System.out.println(data);
		}
		
		//파일의 내용을 다 읽었으면 닫음
		br.close();
		
	}
}
