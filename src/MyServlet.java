

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String gender = request.getParameter("gender");
        String city = request.getParameter("city");
        String country = request.getParameter("country");
        String agreement = request.getParameter("agreement");
        System.out.println("Firstname: " + firstname);
        System.out.println("Lastname: " + lastname);
        System.out.println("gender: " + gender);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);





        // do some processing here...

        // get response writer
        PrintWriter writer = response.getWriter();

        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your Firstname is: " + firstname + "<br/>";
        htmlRespone += "Your Lastname is: " + lastname + "</h2>";
        htmlRespone += "<h2>Gender is: " + gender + "</h2><br/>";
        htmlRespone += "<h2>Your City is: " + city + "</h2><br/>";
        htmlRespone += "<h2>Your Country is: " + country + "</h2><br/>";

        htmlRespone += "</html>";

        // return response
        writer.println(htmlRespone);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
