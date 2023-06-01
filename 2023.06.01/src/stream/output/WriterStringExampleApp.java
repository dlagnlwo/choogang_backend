package stream.output;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterStringExampleApp {
	public static void main(String[] args) throws IOException{
		String filepath = "c:/temp/text10.txt";
		Writer writer = new FileWriter(filepath);
		
		String str = "안녕하세요(●'◡'●)(❁´◡`❁)╰(*°▽°*)╯";
		
//		writer.write(str);
		writer.write(str, 2, 3); //2번째부터 3개만 
								//sql의 decimal 생각하면 됨
		System.out.println("텍스트파일이 생성되었습니다.");
		
		writer.flush();
		writer.close();
	}
}
