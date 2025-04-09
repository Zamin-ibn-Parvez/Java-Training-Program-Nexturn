package sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloServer
 */
@WebServlet("/HelloServer")
public class HelloServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Welcome to the Servelet");
		out.println("<h1> welcome to nexturn </h1>");
		
		Cookie cks [] = request.getCookies();
		for(Cookie ck : cks ) {
			out.println(ck.getName() + "--" + ck.getValue());
		}
		
		HttpSession session = request.getSession();
		out.println("<h2> session = "+ session.getAttribute("climate"));
		session.invalidate();
		out.println("<h2> Session Invalidated");
		

	}

}
