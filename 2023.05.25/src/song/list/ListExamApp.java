package song.list;

import static song.util.MyIO.pl;

import java.util.ArrayList;
import java.util.Arrays;

import song.model.SongDTO;
public class ListExamApp {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<>(
				Arrays.asList("138", "129", "142"));
		String result = "";
		for(int i = 0; i < pitches.size(); i++) {
			result += pitches.get(i);
			result += ","; //콤마 추가
		}
		//마지막 콤마를 제거
		result = result.substring(0, result.length() - 1);
		System.out.println(result);
		
		
//		ArrayList pitches = new ArrayList();
		//3개의 데이터 추가
//		pitches.add("138");
//		pitches.add("129");
//		pitches.add("142");
		
		
		
		
		String one = (String) pitches.get(0);
		String two = (String) pitches.get(1);
		//리스트안에 데이터 하나만 가져오기
		//.get을 붙여야함.
		pl("1번째 요소를 가져오세요 : " + one);
		pl("2번째 요소를 가져오세요 : " + two);
		pl("3번째 요소를 가져오세요 : " + pitches.get(2));
		
		System.out.println("pitches 개수 : " + pitches.size());
		
		//특정값이 포함
		//있으면 true 없으면 false
		pl("142번이 포함되있나? " + pitches.contains("142"));
		pl("500번이 포함되있나? " + pitches.contains("500"));
		
		//인덱스번호로 삭제 = .remove();
//		pl("첫번째 데이터 삭제 : " + pitches.remove(0));
		
		ArrayList songList = new ArrayList();
		ArrayList<SongDTO> songDTOList = new ArrayList();
		
		SongDTO songdto = new SongDTO();
		songdto.setId(1000);
		songdto.setSong_name("좋은날");
		songdto.setSong_contents("가요");
		songdto.setSinger_name("아이유");
		
		//songList.add()애 노란줄 : ArrayList에 대입한 데이터형이 지정되어 있지 않아서
		//데이터형을 지정하시오라는 제네릭 오류임.
		songList.add(songdto);
		
		SongDTO songdto2 = new SongDTO();
		songdto2.setId(1001);
		songdto2.setSong_name("개나리");
		songdto2.setSong_contents("동요");
		songdto2.setSinger_name("");
		
		//songList.add()애 노란줄 : ArrayList에 대입한 데이터형이 지정되어 있지 않아서
		//데이터형을 지정하시오라는 제네릭 오류임.		
		songList.add(songdto2);
		
		System.out.println("songList size : " + songList.size());
		
		SongDTO songdto3 = new SongDTO(1003, "퀸카", "가요", "여자아이들");
		
		//songList.add()애 노란줄 : ArrayList에 대입한 데이터형이 지정되어 있지 않아서
		//데이터형을 지정하시오라는 제네릭 오류임.
		songList.add(0, songdto3); //인덱스 0번에 추가해라.
		
		System.out.println("songList size : " + songList.size());
		
		ArrayList<SongDTO> songs = new ArrayList<>(); //제네릭사용
		songs.add(new SongDTO(300, "하루끝", "가요", "아이유"));
		songs.add(new SongDTO(301, "눈의꽃", "가요", "박효신"));
		songs.add(new SongDTO(302, "I AM", "가요", "아이브"));
		songs.add(new SongDTO(1000, "꽃", "가요", "지수"));
		
		SongDTO findSong = new SongDTO(1000, "좋은날", "", "아이유");
		System.out.println(songs);
		
		
		
//		pl("전체 데이터" + songs);
//		pl("첫번째 songs데이터" + songs.get(0));
		System.out.println(songs.contains(findSong));
		
		
	}
}
