package Learning;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class contact_form_table {
	private String Name;
	private String Email;
	@Id
	private String phone_no;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getphone_no() {
		return phone_no;
	}
	public void setPhone(String phone_no) {
		phone_no = phone_no;
	}
	@Override
	public String toString() {
		return "contactbean [Name=" + Name + ", Email=" + Email + ", phone_no=" + phone_no + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
