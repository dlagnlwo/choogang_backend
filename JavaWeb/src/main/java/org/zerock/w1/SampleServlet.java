package org.zerock.w1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="sampleServlet", urlPatterns = "/sample")
public class SampleServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("...SampleServlet ... doGet " + this);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("...SampleServlet ... doPost " + this);
	}
	
	@Override //init은 public으로만 불려져야함
	public void init(ServletConfig config) {
		System.out.println("...SampleServlet ... init()");
	}
	@Override //destroy는 public으로만 불러져야함
	public void destroy() {
		System.out.println("...SampleServlet ... destroy()");
	}
}
