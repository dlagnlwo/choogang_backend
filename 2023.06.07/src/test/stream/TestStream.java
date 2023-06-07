package test.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestStream {
	public static void main(String[] args) throws IOException {
		String originalFilePath1 = 
				TestStream.class.getResource(
						"originalFile1.jpg").getPath();
		String targetFilePath1 = "c:/temp/targetFile1.jpg";
		
		//파일 읽기
		FileInputStream fis = new FileInputStream(originalFilePath1);
		//파일 출력
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		//버퍼로 파일 읽기 속도 향상
		BufferedInputStream bis = new BufferedInputStream(fis);
		//버퍼로 파일 출력 속도 향상
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		
		long buffer = copy(fis, fos);
		System.out.println(buffer);
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	static int data = -1;
	
	public static long copy(InputStream is, OutputStream os) throws IOException {
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		
		long end = System.nanoTime();
		long diff = (end - start);
		return diff;
	}
}
