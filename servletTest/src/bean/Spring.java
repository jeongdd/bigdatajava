package bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/spring")
public class Spring extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    public Spring() {
    }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("spring get");
      common(request, response);
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("spring post");
      common(request, response);
   }
   
   public void common(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
      System.out.println("공통적으로 실행\n");
   }

}