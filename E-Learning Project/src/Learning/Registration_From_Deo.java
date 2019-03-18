package Learning;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Registration_From_Deo {

	public static void  addForm_Details(String Name,String E_Mail,String Mobile_No,String phonNo, String Date,String time,String Place,String Course,String Fees){
		SessionFactory factory=HibernateUtil.getSessionFactory();
		 Session session = factory.openSession();
		 Transaction tx= session.beginTransaction();
		 
		 registration_formElement b1=new registration_formElement();
		 
		 b1.setName(Name);
		 b1.setE_Mail(E_Mail);
		 b1.setMobile_No(Mobile_No);
		 b1.setDate(Date);
		 b1.setTime(time);
		 b1.setPlace(Place);
		 b1.setCourse(Course);
		 b1.setFees(Fees);

		 
		 session.save(b1);
		
	 tx.commit();
	 session.close();
	
  }


}
