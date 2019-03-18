package Learning;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;



public class TestDAO {

	   public static void  Displayparticular() { 
		    
			SessionFactory factory=HibernateUtil.getSessionFactory();
			
			
			Session session=factory.openSession();
			
	    	List bookList=	session.createQuery("from registration_form").list();
	    	
	    	Iterator itr=bookList.iterator();
	    	
	    	 while (itr.hasNext()) 
	            System.out.println(itr.next()); 

	          session.close();
	    
	    
	    
	    }
	   public List<registration>  getUsers() {
			
			List<registration>  users = new ArrayList<registration> ();
			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();
			
			users=session.createQuery("from registration_form_table").list();
			session.close();
				
			return users;
			
		}
	   
	   
	   
	   
	   public List<Feedback>  getfeedback() {
			
			List<Feedback>  feed = new ArrayList<Feedback> ();
			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();
			
			feed=session.createQuery("from Feedbacks").list();
			session.close();
				
			return feed;
			
		}
	 
	   
	   public List<contact_form_table>  getcontact() {
			
			List<contact_form_table>  co = new ArrayList<contact_form_table> ();
			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();
			
			co=session.createQuery("from contact_form_table").list();
			session.close();
				
			return co;
			
		}
	   
	   
	   
	   
	   
	   
	}
		

