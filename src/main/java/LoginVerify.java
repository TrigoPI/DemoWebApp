

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;
/**
 * Servlet implementation class LoginVerify
 */

@WebServlet("/LoginVerify")
public class LoginVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginVerify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("password");
		
		out.println("<html>");
		out.println("<body>");
		out.println("Username is :" + uname + "<br/>");
		out.println("Password is :" + pwd);
		out.println("salut gros BG <3 <3");
		out.println("</body>");
		out.println("</html>");
	}

}
