package Learning;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;



/**
 * Servlet implementation class forgetpassword
 */
@WebServlet("/forgetpassword")
public class forgetpassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forgetpassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		

		Connection con=ConnectionFile.getConnection();
		
		String user_name1=request.getParameter("username");
		String email=request.getParameter("email");
		String password1=request.getParameter("password");
		
		LoginClass emp=new LoginClass();
		emp.setName(user_name1);
		emp.setPassword(password1);
		emp.setEmail(email);
		
		
		
		if(ConnectionFile.validatepass(user_name1,email,con))
		{
			ConnectionFile.updatepsw(emp, con);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			//PrintWriter pw1=response.getWriter();
			//pw1.print("<html><body><center><p style=\"color:green;font-size:20px;\">Successfully Update</p></center></body></html>");
			
		}
		else
		{
									
				
			RequestDispatcher rd=request.getRequestDispatcher("forgetpassword.jsp");
			rd.include(request, response);
			PrintWriter pw=response.getWriter();
			pw.print("<html><body><center><p style=\"color:red;font-size:20px;\">*Username and Email_Id are not matches</p></center></body></html>");
			
			
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
