package Learning;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


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
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();


		String username1=request.getParameter("username");
		String password1=request.getParameter("password");
	
		HttpSession sessio=request.getSession();  
        sessio.invalidate();  
        System.out.println("invalid session");
		 
	     
	 	
		
	
		Connection con=ConnectionFile.getConnection();
		
		if(ConnectionFile.validate(username1,password1,con))
		{
			HttpSession session =  request.getSession();
			 session.setAttribute ("name", username1); 
			   System.out.println("username :" + username1);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		 
			rd.forward(request, response);
			
		} else if(ConnectionFile.validate1(username1,password1,con)) {
			HttpSession session =  request.getSession();
			 session.setAttribute ("name", username1); 
			   System.out.println("username :" + username1);
			RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
		 
			rd.forward(request, response);
		}
		else
		{
			
			 HttpSession session=request.getSession();  
	         session.invalidate();  
	         System.out.println("invalid session");

			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
			
			pw.print("<html><body><center><p style=\"color:red;font-size:20px;\">*please enter correct username and password</p></center></body></html>");
		}	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
