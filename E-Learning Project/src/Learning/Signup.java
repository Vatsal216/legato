package Learning;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.*;
/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String username1 = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		 PrintWriter pw = response.getWriter();
		Connection con=ConnectionFile.getConnection();
		
		
		if(ConnectionFile.search(username1, con)) {
			
			
			RequestDispatcher rd=request.getRequestDispatcher("Signup.jsp");
			rd.include(request, response);
			pw.print("<html><body><center><p style=\"color:red;font-size:20px;\">*Userid Already Exists</p></center></body></html>");
		
		}else {
			LoginClass emp=new LoginClass();
			emp.setName(username1);
			emp.setEmail(email);
			emp.setPassword(password);
			
			ConnectionFile.signup(emp,  con);
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
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
