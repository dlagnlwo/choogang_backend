package song.vo;

public class SongVO {
	private int id;
	private String song_name;
	private String song_contents;
	private String singer_name;
	
	
	public SongVO(int id, String song_name, String song_contents, String singer_name){
		this.id = id;
		this.song_name = song_name;
		this.song_contents = song_contents;
		this.singer_name = singer_name;
	}
	
	public int getId() {
		return id;
	}

	public String getSong_name() {
		return song_name;
	}

	public String getSong_contents() {
		return song_contents;
	}

	public String getSinger_name() {
		return singer_name;
	}

	
	
	
	
}
