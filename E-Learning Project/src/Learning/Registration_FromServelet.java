package Learning;

import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration_FromServelet
 */
@WebServlet("/Registration_FromServelet")
public class Registration_FromServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration_FromServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//int reg_No=Integer.parseInt(request.getParameter("Reg_No"));
		String name=request.getParameter("Name");
		String e_mail=request.getParameter("E-mail");
		String mobileNo=request.getParameter("Mobile_No");
		String phonNo=request.getParameter("phonNo");
		String date=request.getParameter("Date");
		String time=request.getParameter("Time");
		String Place=request.getParameter("Place");
		String course=request.getParameter("Course");
		String fees=request.getParameter("Fees");
		
		
		
		
		Registration_From_Deo u1=new Registration_From_Deo();
		u1.addForm_Details(name,e_mail,mobileNo,phonNo,date,time,Place,course,fees);
		
		
		
		
	}

}
