import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.security.spec.ECField;

@WebServlet(name = "CalcServlet", urlPatterns = "")
public class CalcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  getServletContext().getRequestDispatcher("/Calculator.jsp").forward(request,response);
        System.out.println("GETTING");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {

        Integer principalAmount = Integer.parseInt(request.getParameter("Principal Amount $"));
        Integer interestRate = Integer.parseInt(request.getParameter("Interest Rate"));
        Integer numberOfYears = Integer.parseInt(request.getParameter("Year"));
        Integer compoundRate = Integer.parseInt(request.getParameter("Compound Rate"));

        System.out.println(principalAmount);
        System.out.println(interestRate);
        System.out.println(numberOfYears);
        System.out.println(compoundRate);
        Integer amount;

        if (principalAmount==null|| interestRate == null || numberOfYears == null || compoundRate == null) {
               request.setAttribute("error","You are missing one of the inputs");
        } else {
            System.out.println("done");
            amount = principalAmount * (1 + (interestRate / numberOfYears)) * numberOfYears;

            doGet(request,response);
        }
    }
}
