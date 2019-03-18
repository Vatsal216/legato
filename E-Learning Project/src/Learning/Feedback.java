package Learning;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity 
@Table(name="feedback_form_table")
public class Feedback {

	@Column(name="uname")
private String name;

@Column(name="email")
private String email;
@Column	(name="feedback")
private String feedback;
@Id
@Column(name="Phone")
private int phone;


public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}
@Override
public String toString() {
	return "Feedback [name=" + name + ", email=" + email + ", feedback=" + feedback + "]";
}





}
