package song.model;

import java.util.Objects;

public class SongDTO {
	private int id;
	private String song_name;
	private String song_contents;
	private String singer_name;
	
	
	public SongDTO(int id, String song_name, String song_contents, String singer_name){
		this.id = id;
		this.song_name = song_name;
		this.song_contents = song_contents;
		this.singer_name = singer_name;
		setAllMember(id, song_name, song_contents, singer_name);
	}
	public SongDTO() {
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSong_name() {
		return this.song_name;
	}
	
	public void setSong_name(String Song_name) {
		this.song_name = Song_name;
	}
	
	public String getSong_contents() {
		return this.song_contents;
	}
	
	public void setSong_contents(String song_contents) {
		this.song_contents = song_contents;
	}
	
	public String getSinger_name() {
		return this.singer_name;
	}
	
	public void setSinger_name(String singer_name) {
		this.singer_name = singer_name;
	}
	
	// 모든 멤버를 한번에 추가하는 메소드 setAllMember
	public void setAllMember(	int id, 
								String song_name, 
								String song_contents,
								String singer_name	) {
		this.id = id;
		this.song_name = song_name;
		this.song_contents = song_contents;
		this.singer_name = singer_name;
		
	}
	
	@Override
	public String toString() {
		String msg = 	"\n노래ID : " + this.id + "\n" +
						"노래이름 : " + this.song_name + "\n" +
						"노래장르 : " + this.song_contents + "\n" +
						"가수이름 : " + this.singer_name;
		return msg;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, singer_name, song_contents, song_name);
	}
	
}
