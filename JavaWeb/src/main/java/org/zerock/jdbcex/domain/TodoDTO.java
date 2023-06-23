package org.zerock.jdbcex.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //setter, getter, ToString 모아둔 어노테이션
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoDTO {
	private long tno;
	private String title;
	private LocalDate dueDate;
	private boolean finished;
}
