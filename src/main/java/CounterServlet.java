
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {

        int counter = 0;

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            try {
                if (request.getParameter("reset").equals("1")) {
                    counter = 0;
                }
            } catch (NullPointerException ex) {
                ex.printStackTrace();
            }

            counter++;
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("Counter: <h1>" + counter + "</h1>");

    }

}
