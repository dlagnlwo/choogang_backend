

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OtherServlet
 */
@WebServlet("/OtherServlet")
public class OtherServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = (String)request.getAttribute("dataAttribute");
		
		String result = ProcessData(data);
		PrintWriter out = response.getWriter();
		out.println("Processed data: " + result);
	}
	private String ProcessData(String data) {
		StringBuilder reversed = new StringBuilder(data);
		return reversed.toString();
	}

}
