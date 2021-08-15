import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Reg_form")
public class Reg_form extends HttpServlet 
{
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
		response.setContentType("text/html");
            try (PrintWriter out = response.getWriter())
            {
                String name=request.getParameter("uname");
                String email=request.getParameter("uemail");
                String password=request.getParameter("upass");
                String date=request.getParameter("udate");
                String gender=request.getParameter("ugender");
                String phone=request.getParameter("uphone");
                String country=request.getParameter("cou");
                
                Customer c=new Customer();
                c.setName(name);
                c.setEmail(email);
                c.setPassword(password);
                c.setDate(date);
                c.setGender(gender);
                c.setPhone(phone);
                c.setCountry(country);
                
                int status=CustDao.save(c);
                if(status>0)
                {
                    request.getRequestDispatcher("Login.html").include(request, response);
                }
                else
                {
                    out.println("Sorry! unable to save record");
                }
            }
	}
}