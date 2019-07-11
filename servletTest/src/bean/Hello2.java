package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/hi") //spring에서 중요함!!!! => class임 / hello를 요청했을 때 밑에 있는 method를 실행
public class Hello2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Hello2() {
    }
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html>"); // ln은 브라우저 소스에서 줄 바꿈을 위하여
		out.println("<head><title></title></head>");
		out.println("<body>");
		out.println("<h1>hi...</h1>");
		out.println("<h2>hi2...</h2>");
		out.println("</body>");
		out.println("</html>");
	}

}
