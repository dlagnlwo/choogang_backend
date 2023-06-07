package mystream.myreader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConverterStreamExampleApp {
	public static void main(String[] args) throws IOException {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);	
	}
	//FileNotFoundException은 IOException의 자식
	//IOException 은 Exception의 자식
	//즉 순서도 = FileNotFoundException -> IOException -> Exception  
	public static void write(String str) throws IOException{
		// FileOutputStream으로 바이트 스트림 쓰기
		FileOutputStream fos = new FileOutputStream("c:/temp/test1.txt");
		// 바이트 스트림을 문자열 보조 스트림으로 연결
		Writer writer = new OutputStreamWriter(fos);
		// 문자열 단위로 출력
		writer.write(str);
		writer.flush(); //안쓰는 데이터가 있을수도 있으므로 버퍼를 비운다.
		writer.close();
	}
	public static String read() throws IOException{
		//파일 읽기 = FileInputStream
		FileInputStream fis = new FileInputStream("c:/temp/test1.txt");
		
		// 바이트스트림을 문자열스트림으로 변환
		Reader reader = new InputStreamReader(fis);
		
		// 파일 내용을 문자열단위로 저장할 임시저장소 변수선언
		char[] buffer = new char[100];
		int readCharSize = reader.read(buffer);
		reader.close();
		
		String data = new String(buffer, 0, readCharSize);
		return data;
	}

}
