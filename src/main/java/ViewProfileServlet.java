import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

 @WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
 public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
   ServletException, IOException {

//        adjust here..This is where the user logged in can get to profile--versus not logged in no able to view


        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
    }
}
