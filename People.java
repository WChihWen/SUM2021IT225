import java.sql.Date;

public class People {
	private String No;	
	private String FirstName;
	private String LastName;
	private String Email;
	private String Dateadded;
	private String Dateexpired;
	
	public void setNo(String _No) {
		No = _No;		
	}
	
	public String getNo() {
		return No;		
	}
	
	public void setFirstName(String _FirstName) {
		FirstName = _FirstName;		
	}
	
	public String getFirstName() {
		return FirstName;		
	}
	
	public void setLastName(String _LastName) {
		LastName = _LastName;		
	}
	
	public String getLastName() {
		return LastName;		
	}
	
	public void setEmail(String _Email) {
		Email = _Email;		
	}
	
	public String getEmail() {
		return Email;		
	}
	
	public void setDateadded(String _Dateadded) {
		Dateadded = _Dateadded;		
	}
	
	public String getDateadded() {
		return Dateadded;		
	}
	
	public void setDateexpired(String _Dateexpired) {
		Dateexpired = _Dateexpired;		
	}
	
	public String getDateexpired() {
		return Dateexpired;		
	}
	
}
