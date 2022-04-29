
import model.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PersonServlet", value = "/person")
public class PersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get the three params we need for a Person

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");

        //If any of the params are missing, we will
        //add it to the error

        StringBuilder error = new StringBuilder();
        if (firstName == null) {
            error.append("A first name was not provided");
        } else if (lastName == null) {
            error.append("A last name was not provided");

        } else if (age == null) {
            error.append("An age was not provided");

        } else {
            request.setAttribute("firstName", firstName);
            request.setAttribute("lastName", lastName);
            request.setAttribute("age", age);
        }
        //if errors were found, add the error as attribute to be displayed

        if (error.length() > 0) {
            request.setAttribute("error", error.toString());
            request.setAttribute("person",new Person());
        }else {
            request.setAttribute("person", new Person(firstName, lastName, Integer.parseInt(age)));

        }
        //forward all of the information
        getServletContext().getRequestDispatcher("/person.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
