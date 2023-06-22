package com.mysql.cj.jdbc.domain;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class TestTodoVO {
	private long tno;
	private String title;
	private LocalDate dueDate;
	private boolean finished;
}
