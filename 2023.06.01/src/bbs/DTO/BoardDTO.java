package bbs.DTO;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDTO {
	private int no;
	private String writer;
	private Date date;
	private String title;
}
