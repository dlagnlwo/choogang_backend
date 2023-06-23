package org.zerock.jdbcex.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Builder //맴버변수를 이용한 builder메소드 실행
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TodoVO {
	private long tno;
	private String title;
	private LocalDate dueDate;
	private boolean finished;
}
