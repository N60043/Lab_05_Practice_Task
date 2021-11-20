

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(filterName = "ValidateFilter")
public class ValidateFilter implements Filter {
    private ServletRequest request;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String gender = req.getParameter("gender");
        String country = req.getParameter("country");
        String agreement = req.getParameter("agreement");

        if (firstname  == null || "".equals(firstname )
                || lastname == null || "".equals(lastname) || gender == null || "".equals(gender)
                || country == null || "".equals(country) || agreement == null || "".equals(agreement)) {

            request.setAttribute("errMsg", "One or both fields are empty");



        }


        chain.doFilter(request, resp);
        writer.println("Data inserted Successfully");



    }

    public void init(FilterConfig config) throws ServletException {

    }

}

