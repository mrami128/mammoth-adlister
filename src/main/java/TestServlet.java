import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// VIEW java ee in28minutes @youtube -Link--> https://www.youtube.com/watch?v=pOUDEFVjUXM
// NOTES: first create a servlet ->
// make sure you are in java folder path ->
// right click to make new servlet..name it with Capital CamelCase
//
// 1st when new file opens goto public class ->add this -> extends http servlet
//
// 2nd in @Web -> add 2nd part to the annotation -> first part auto populates but note this shortcut-> @Web 'cntrl space'-> yu will need 2nd part
//  the @Web add -> comma  ,url patterns = "/testServ"-->see below
//
// 3rd add empty  doGet (cntrl space) if sending url for logout example is doGET..
// 4th  add empty  doPost if sending login form . these are 2 empty dummy methods ..
     //  if problem.. it will show error--otherwise you could see result by inspecting source and choose network
// 5th you can  add ->response.getWriter().println(" blah.blah")  to write something to the screen
//                  better would be to send /redirect the html to jsp/view folder ->see testview .jsp file for details.

// note: AFTER adjusting servlets/aka contrllers, beans, interfaces they are java type ->you click LONG Tomcat run..
    // versus.. FAST Tomcat RUN after adjusting a  jsp aka view type file.
    //
// TO run this servlet: once localhost:8080 screen displays ->
    // put  /testServ  and enter to see it run...
   //to see this servlet run --> run tomcat  when localhost:8080 shows -> add /testServ ->hit Enter
   //
// dont want much html in servlets so create JSP (aka views) in the webapp--WEB-INF folder for added secrty--19:25 on video

@WebServlet(name = "TestServlet",     urlPatterns = "/testServ")

public class TestServlet     extends HttpServlet {

    protected void  doGet  (HttpServletRequest request, HttpServletResponse response) throws
           ServletException, IOException {

// note: instead of writing here aim -redirect to a jsp view file
//        response.getWriter().println("<h1><B> Buddy! this works Testing the /testServ</B></h1>");

// note: this is how to redirect to jsp: put html over there in the view side.of this app
        request.getRequestDispatcher("/WEB-INF/testview.jsp").forward(request,response);
        }

        // before modification--of the doGet
        //  @Override
        //     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //       super.doPost(req, resp);
        //   }
} //end pub class
