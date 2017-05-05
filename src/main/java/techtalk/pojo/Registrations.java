package techtalk.pojo;

public class Registrations {

	private int regid;
	
	private String email;
	 
    private  int techid;
   
   public Registrations() {
	// TODO Auto-generated constructor stub
}

public Registrations(int regid, String email, int techid) {
	
	this.regid = regid;
	this.email = email;
	this.techid = techid;
}

public int getRegid() {
	return regid;
}

public void setRegid(int regid) {
	this.regid = regid;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getTechid() {
	return techid;
}

public void setTechid(int techid) {
	this.techid = techid;
}

@Override
public String toString() {
	return String.format("Registration [regid=%s, email=%s, techid=%s]", regid, email, techid);
}
	
}
