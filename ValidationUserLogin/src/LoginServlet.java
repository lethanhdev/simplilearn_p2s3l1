import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;



/**
* Servlet implementation class LoginServlet
*/
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                
             String userId    = request.getParameter("userid");
             String userEmail = request.getParameter("useremail");
             String userPass  = request.getParameter("userpass");
             
             if (userId.equals("admin") && userEmail.equals("admin@learner.com") && userPass.equals("123")){							// hard code for correct userid, email, password
	             HttpSession session=request.getSession();  
	             session.setAttribute("userid",  userId);	            

	             response.sendRedirect("dashboard");  			// send to to dashboard
             } else
            	 response.sendRedirect("error");			// if not admin, send to error page
                
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}