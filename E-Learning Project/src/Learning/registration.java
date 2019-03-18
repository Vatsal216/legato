package Learning;

public class registration {

	private String name;
private int reg_no;
private int mobile_no;
private String email;
private String Date;
private String time;
private String place;
private String course_selected;
private String fees;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getReg_no() {
	return reg_no;
}
public void setReg_no(int reg_no) {
	this.reg_no = reg_no;
}
public int getMobile_no() {
	return mobile_no;
}
public void setMobile_no(int mobile_no) {
	this.mobile_no = mobile_no;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public String getCourse_selected() {
	return course_selected;
}
public void setCourse_selected(String course_selected) {
	this.course_selected = course_selected;
}
public String getFees() {
	return fees;
}
public void setFees(String fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "registration [name=" + name + ", reg_no=" + reg_no + ", mobile_no=" + mobile_no + ", email=" + email
			+ ", Date=" + Date + ", time=" + time + ", place=" + place + ", course_selected=" + course_selected
			+ ", fees=" + fees + "]";
}







}

