package bbs.mariadb.model;

import java.sql.Blob;
import java.util.Date;

import lombok.Data;

@Data
public class Board {
	private int bno;
	private String btitle;
	private String bwriter;
	private String bcontent;
	private Date bdate;
	private String bfilename;
	private Blob bfiledata;
}
