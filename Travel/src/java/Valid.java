import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Valid extends HttpServlet 
{

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
   {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            String name = request.getParameter("user");
            String password = request.getParameter("pass");
            if(password.equals("pranay"))
            {
                RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
                rd.forward(request, response);
            }
            else
            {
                out.println("<script>");
                out.println("alert('You have entered incorrect password')");
                out.println("</script>");
                RequestDispatcher rd = request.getRequestDispatcher("Admin_login.html");
                rd.include(request, response);
            }
        }
    }
}