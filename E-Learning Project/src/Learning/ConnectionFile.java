package Learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class ConnectionFile {
	public static Connection getConnection() {
	    
	      
	       try
	       {
	          Class.forName("com.mysql.cj.jdbc.Driver");
	          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elearning","root","admin");
	          System.out.println("connect successfully");
	          return con; 								     
	         }
	          
	          catch (SQLException ex)
	          {
	             ex.printStackTrace();
	             return null;
	          }
	       
		       catch(ClassNotFoundException e)
		       {
		          System.out.println(e);
		          return null;
		       }
	      }  
	
	
	
	public static boolean validate(String username1, String password1, Connection con) {
		
		boolean flag=false;
		try
		{
			String sql2="select * from login_table where  user_name=? and  password=?";
			PreparedStatement pstmt=con.prepareStatement(sql2);
			pstmt.setString(1,username1);
			pstmt.setString(2,password1);
			System.out.println("successfully");
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				flag=true;
				break;
			}		
		 }
			 catch (SQLException ex)
	          {
	             ex.printStackTrace();	             
	          }
		return flag;
	}
	
public static boolean validate1(String username1, String password1, Connection con) {
		
		boolean flag=false;
		try
		{
			String sql2="select * from admin_table where  user_name=? and  password=?";
			PreparedStatement pstmt=con.prepareStatement(sql2);
			pstmt.setString(1,username1);
			pstmt.setString(2,password1);
			System.out.println("successfully");
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				flag=true;
				break;
			}		
		 }
			 catch (SQLException ex)
	          {
	             ex.printStackTrace();	             
	          }
		return flag;
	}
	
	

	
	
public static boolean validatepass(String user_name1, String email, Connection con) {
		
		boolean flag=false;
		try
		{
			String sql2="select * from login_table where  user_name=? and email=?";
			PreparedStatement pstmt=con.prepareStatement(sql2);
			pstmt.setString(1,user_name1);
			pstmt.setString(2,email);
			System.out.println("successfully Find");
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				flag=true;
				break;
			}		
		 }
			 catch (SQLException ex)
	          {
	             ex.printStackTrace();	             
	          }
		return flag;
	}
	
	
	
	
	
public static void updatepsw(LoginClass emp, Connection con) {
		
	    String sql2="Update login_table set password=? WHERE user_name=? ";
		try
		{
			
			
			PreparedStatement pstmt=con.prepareStatement(sql2);
			pstmt.setString(1,emp.getPassword());
			pstmt.setString(2,emp.getName());
		
			System.out.println("update successfully");
			pstmt.executeUpdate();
			
			pstmt.close();
		 }
			 catch (SQLException ex)
	          {
	             ex.printStackTrace();	             
	          }
	
	}

public static boolean search(String username1, Connection con) {
	boolean flag = false;
	
	 
	try 
	{
		String sq12 =	"select * from login_table where  user_name=? ";
	
		    PreparedStatement pstmt=con.prepareStatement(sq12);
	          pstmt.setString(1, username1);
	          System.out.println("Matched");
	          ResultSet rs=pstmt.executeQuery(); 
	  		while(rs.next())
			{
				flag=true;
				break;
			}		
		 }
			 catch (SQLException ex)
	          {
	             ex.printStackTrace();	             
	          }
		return flag;
	}
	



public static void signup (LoginClass emp, Connection con ) {
	
	
			String sql12 = "insert into login_table values(?,?,?)";
			
			try {
				  PreparedStatement pstmt=con.prepareStatement(sql12);
				  pstmt.setString(1, emp.getName());
				  pstmt.setString(2, emp.getEmail());
				  pstmt.setString(3, emp.getPassword());
				  
					System.out.println("update successfully");
					pstmt.executeUpdate();
					
					pstmt.close();
				 }
					 catch (SQLException ex)
			          {
			             ex.printStackTrace();	             
			          }
			
			}


public static void insertData(LoginClass emp, Connection con) {
	// TODO Auto-generated method stub

	
	
	String sql = "insert into feedback_form_table values(?,?,?,?)";
	try{
		 
	 
	 PreparedStatement pstmt = con.prepareStatement(sql);
	 pstmt.setString(1, emp.getName());
	 pstmt.setString(2, emp.getEmail());
	 pstmt.setString(3, emp.getFeedback());
	 pstmt.setString(3, emp.getPhone());
			 
			 pstmt.executeUpdate();
			 
			 pstmt.close();
			 
			 } catch (SQLException e){
			    e.printStackTrace();
				}
}

public static void insertDat(LoginClass emp, Connection con) {
	// TODO Auto-generated method stub

	
	
	String sql = "insert into contact_form_table values(?,?,?)";
	try{
		 
	 
	 PreparedStatement pstmt = con.prepareStatement(sql);
	 pstmt.setString(1, emp.getName());
	 pstmt.setString(2, emp.getEmail());
	 pstmt.setString(3, emp.getPhone());
	
			 
			 pstmt.executeUpdate();
			 
			 pstmt.close();
			 
			 } catch (SQLException e){
			    e.printStackTrace();
				}
}
	


public static ArrayList<LoginClass> contactdisplayData(Connection con) {
	// TODO Auto-generated method stub
	String sql2="select * from contact_form_table";
	try
	{
		PreparedStatement pstmt1=con.prepareStatement(sql2);
		ArrayList a1= new ArrayList();
		ResultSet rs=pstmt1.executeQuery();
		while(rs.next())
		{
			LoginClass emp=new LoginClass();
			emp.setName(rs.getString(1));
			emp.setEmail(rs.getString(2));
			emp.setPhone(rs.getString(3));
			
		
	
			
			a1.add(emp);
		}
			pstmt1.close();
			rs.close();
			return a1;
			
				
	 }
		 catch (SQLException e)
          {
             e.printStackTrace();	             
          }
	return null;
}

	
			
	
}





	




