package bbs.model;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDTO {
	private int bno;
	private String btitle;
	private String bcontetn;
	private String bwriter;
	private Date bdate;
}
