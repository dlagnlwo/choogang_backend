package stream.output;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExamApp {
	//throws Exception으로 해도 됨,
	//이유는 Exception이 IOException의 부모이기 때문
	//부모는 제일 큰 규모이고 그 아래 자식 전부 포함이 되어 있음.
	public static void main(String[] args) throws IOException{
		//문자 출력 스트림
		//파일이 텍스트파일로 저장이 됨.
		//output 이면 파일이 바이트형식으로 저장이 됨.
		String filepath = "c:/temp/test9.txt";
		Writer writer = new FileWriter(filepath);
		
//		char a = 'A';
//		char b = 'B';
//		char c = 'C';
//		char d = 'D';
//		char e = 'E';
		
		char[] array = new char[5];
		array[0] = 'A';
		array[1] = 'B';
		array[2] = 'C';
		array[3] = 'D';
		array[4] = 'E';
		
//		writer.write(a);
//		writer.write(b);
//		writer.write(c);
//		writer.write(d);
//		writer.write(e);
		
		//배열의 내용 출력
//		writer.write(array);
		
		//배열의 일부 출력
		writer.write(array, 1, 3); //1부터 3개만 찍어라 
								   //그러므로 'B','C','D'만 찍힘
		System.out.println("텍스트파일이 생성되었습니다.");
		
		writer.flush(); //출력스트림버퍼에 남은 내용이 있으면 전부 삭제
		writer.close();
		
	}
}
