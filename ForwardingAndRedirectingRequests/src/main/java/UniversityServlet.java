import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UniversityServlet", urlPatterns = "/university")
public class UniversityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       //request forwarding
     //   getServletContext().getRequestDispatcher("/secondary").forward(request, response);

    //request redirecting
      //  response.sendRedirect("https://rims.edu.lv/");
        response.sendRedirect("/secondary");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
