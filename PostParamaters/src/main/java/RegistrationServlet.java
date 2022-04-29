import javax.security.auth.login.AccountException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegistrationServlet", urlPatterns = "/register")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//processing post form request
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        if (email == null || name == null || age == null || password == null || confirmPassword == null) {

            request.setAttribute("error", "You are missing one of the inputs");
//getServletContext().getRequestDispatcher("register.jsp").forward(request,response);
           request.setAttribute("error","Write once again");
            System.out.println("missed");
        } else {
            if (!password.equalsIgnoreCase(confirmPassword)) {
                request.setAttribute("error", "password did not match");
                doGet(request, response);
            } else {
                System.out.println("The account has been created");
            }
        }
    }
}
