package Learning;

public class LoginClass {

	
		
		private String Name;
		private String Password;
		private String Email;
		private String feedback;
		private String Phone;
		

		public String getPhone() {
			return Phone;
		}
		public void setPhone(String phone) {
			Phone = phone;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			this.Name = name;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			this.Password = password;
		}

		
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			this.Email = email;

		}
		public String getFeedback() {
			return feedback;
		}
		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}
		@Override
		public String toString() {
			return "LoginClass [Name=" + Name + ", Password=" + Password + ", Email=" + Email + ", feedback=" + feedback
					+ ", Phone=" + Phone + ", toString()=" + super.toString() + "]";
		}
	
		
		
		
	}

