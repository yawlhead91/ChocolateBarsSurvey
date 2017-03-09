package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Handler
 */
@WebServlet("/handler")
public class Handler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Handler() throws IOException {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter output;
		String firstChoice = request.getParameter("group1");
		String secondChoice = request.getParameter("group2");
		
		Cookie cookies[]= request.getCookies();
		
		int f = exists(firstChoice, cookies);
		if( f > 0){
			f += 10;
			Cookie c = new Cookie(firstChoice, Integer.toString(f));
			c.setMaxAge(60*60*60*60);
			response.addCookie(c);
		}else {
			System.out.println("Adding new first");
			Cookie c = new Cookie(firstChoice, "10");
			c.setMaxAge(60*60*60*60);
			response.addCookie(c);
		}
			
		int s = exists(secondChoice, cookies);
		if( s > 0){
			s += 10;
			Cookie d = new Cookie(secondChoice, Integer.toString(s));
			d.setMaxAge(60*60*60*60);
			response.addCookie(d);
		}else {
			Cookie d = new Cookie(secondChoice, "5");
			d.setMaxAge(60*60*60*60);
			response.addCookie(d);
		}
			
		response.sendRedirect("/BarSurvey/results.jsp");
		
		
		
		output = response.getWriter();
		output.close();
	}
	
	private int exists(String name, Cookie cookies[]){
		for (int i = 0; i < cookies.length; i++){
			if(cookies[i].getName().equals(name)){
				return Integer.parseInt(cookies[i].getValue());
			}
		}
		return 0;
	}
}
	
