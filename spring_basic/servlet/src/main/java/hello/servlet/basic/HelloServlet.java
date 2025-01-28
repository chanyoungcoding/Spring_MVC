package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        System.out.println("Req = " + req);
        System.out.println("Res = " + res);

        String username = req.getParameter("username");

        System.out.println(username);

        res.setContentType("text/plain");
        res.setCharacterEncoding("utf-8");
        res.getWriter().write("hello" + username);
    }
}
