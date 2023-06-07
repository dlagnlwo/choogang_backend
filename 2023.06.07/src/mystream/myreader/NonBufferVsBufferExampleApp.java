package mystream.myreader;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVsBufferExampleApp {
	public static void main(String[] args) throws Exception{
		//현재프로그램의 경로에 있는 "originalFile1.jpg"의 실체위치를 가져와라
		String originalFilePath1 = 
				NonBufferVsBufferExampleApp.class.getResource(
				"originalFile1.jpg").getPath();
		// 복사할 경로를 가르키는 문자열
		String targetFilePath1 = "c:/temp/targetFile1.jpg";
		
		//실제 파일을 읽어오는 스트림 (inputstream)
		FileInputStream fis =
				new FileInputStream(originalFilePath1);
		// 파일을 저장할 스트림
		FileOutputStream fos =
				new FileOutputStream(targetFilePath1);
		
		// 버퍼스트림을 이용해서 original의 파일내용을 target파일에 저장
		String originalFilePath2 = 
				NonBufferVsBufferExampleApp.class.getResource("originalFile2.jpg")
				.getPath();
		String targetFilePath2 = "c:/temp/targetFile2.jpg";
		
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//버퍼를 사용하지 않고 실제 파일복사를 진행하는 부분(=NonBuffered)
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용안했을때 : \t" + nonBufferTime + "ns");
		
		//버퍼를 사용하고 실제 파일복사를 진행하는 부분
		long bufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용했을때 : \t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		
	}
	
	//정적멤버 메소드에서 사용할 정적변수 하나 선언
	static int data = -1; //입력스트림으로 부터 1바이트의 데이터를 읽을 때
							// 그 데이터를 저장할 변수
	//데이터를 복사하는 copy메소드 구현
	//시간이 리턴되어야 함
	public static long copy(InputStream is, OutputStream os) throws Exception{
		//시스템의 현재 시간을 나노초 (1/10^9 초) 단위로 반환
		//입력스트림의 크기를 모르므로 무한루프
		long start = System.nanoTime();
		while(true) {
			data = is.read(); //입력스트림으로부터 1바이트 읽어오기
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		
		long end = System.nanoTime();
		
		long diff = (end - start); //두시간의 차이
		return diff;
	}
	
}
