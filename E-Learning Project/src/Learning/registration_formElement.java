package Learning;

import java.util.Timer;
import java.util.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Registration_Form_Details")
public class registration_formElement {
	private String Name;
	private String E_Mail;
	private String Mobile_No;
	@Id
	@GeneratedValue
	private int Registration_No;
	private String Date;
	private String Time;
	private String Place;
	private String Course;
	private String Fees;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getE_Mail() {
		return E_Mail;
	}
	public void setE_Mail(String e_Mail) {
		E_Mail = e_Mail;
	}
	public String getMobile_No() {
		return Mobile_No;
	}
	public void setMobile_No(String mobile_No) {
		Mobile_No = mobile_No;
	}
	public int getRegistration_No() {
		return Registration_No;
	}
	public void setRegistration_No(int registration_No) {
		Registration_No = registration_No;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getFees() {
		return Fees;
	}
	public void setFees(String fees) {
		Fees = fees;
	}
}
