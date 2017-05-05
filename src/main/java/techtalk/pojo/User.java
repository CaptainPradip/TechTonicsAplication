package techtalk.pojo;



public class User
{
	private int empid;
	private String name;
	
	private String email;
	private String password;
    private String role;
    public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int empid, String name, String email, String password, String role) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return String.format("User [empid=%s, name=%s, email=%s, password=%s, role=%s]", empid, name, email, password,
				role);
	}
	
}
