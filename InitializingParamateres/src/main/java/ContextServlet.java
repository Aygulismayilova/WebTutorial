import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ContextServlet", urlPatterns = "/token")
public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //How to access the context initialization parameter -- Global to all servlets

        String token = getServletContext().getInitParameter("authorizationToken");
        if (token != null) {
            System.out.println("Auth token : " + token);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
