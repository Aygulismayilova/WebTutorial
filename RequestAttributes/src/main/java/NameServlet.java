import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NameServlet", urlPatterns = "/name")
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        if (firstName == null || lastName == null) {
            System.out.println("Error, they did not provide a full name.");
        } else {

            //We now know how to grab parameters from the request
            //but we can also add our own, which is similar to parameters
            //accept they are called attributes. Attributes are
            //added in between request processing. Remember that when we forward
            //a request to say a JSP page, the request is sent too
            //and then we can grab information from the request there.
            //Attributes are useful for situations like that, we can add
            //values/objects into the request and then forward the data
            //to be accessed elsewhere.

            //You can use the setAttribute method and then
            //provide key value pairs of what data you want
            //to store.
            request.setAttribute("firstName", firstName);
            request.setAttribute("lastName", lastName);

            //Practically, it doesn't make sense to take the parameters
            //and add them again as attributes since the parameters are
            //already in the request, but just for demonstration purposes
            //it's fine, not a big deal.

            //Now that we have stored the data, let's forward the request.
            getServletContext().getRequestDispatcher("/name.jsp").forward(request, response);

        }

    }

}
