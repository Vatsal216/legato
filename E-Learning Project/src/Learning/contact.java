
package Learning;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class contact
 */
@WebServlet("/contact")
public class contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Connection con=ConnectionFile.getConnection();
		String name=request.getParameter("Name");
		String email=request.getParameter("E-mail");
		String phone=request.getParameter("Mobile No.");
		
		LoginClass emp=new LoginClass();
		emp.setName(name);
		emp.setEmail(email);
		emp.setPhone(phone);
		
		ConnectionFile.insertDat(emp, con);
		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		rd.forward(request, response);
		
		 ArrayList<LoginClass>a1=ConnectionFile.contactdisplayData(con);
		  request.setAttribute("emp", a1);
	    RequestDispatcher r=request.getRequestDispatcher("admin.jsp");
		  r.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
