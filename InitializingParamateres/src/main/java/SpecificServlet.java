import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SpecificServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Get the servlet init parameter from the ServletConfig rather than the context
        //only this servlet can access the init param assigned to it

        String copyrightYear = getServletConfig().getInitParameter("copyrightYear");
        if (copyrightYear != null) {
            System.out.printf("copyrightYear " + copyrightYear);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
