package org.zerock.jdbcex.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.log4j.Log4j2;


@WebServlet(name = "todoListController2", urlPatterns = "/todo/list2")
@Log4j2 
public class TodoListController extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		log.info("info입니다.");
		log.error("Error입니다.");
		log.warn("warn입니다.");
	}
}
