package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/day.do")
public class Myday extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Myday() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String day = request.getParameter("day");
		String sub = request.getParameter("sub");
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html>"); 
		out.println("<head><title></title></head>");
		out.println("<body>");
		out.println("================================<br>");
		out.println("오늘은 " + day + "입니다.<br>");
		out.println("오늘 나는  " + sub + "을 배우는 중입니다.<br>");
		out.println("================================<br>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
}
