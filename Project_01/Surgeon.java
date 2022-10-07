package Project_01;

public class Surgeon extends Doctor {
	private String operating;
	public Surgeon(String Type, String Name, String blazerID, String Speciality, String Operating) {
		super(Type, Name, blazerID, Speciality);
		this.operating=Operating;
		
	}
	public String getOperating() {
		return this.operating;
	}
	public void setOperating(String opinput) {
		this.operating = opinput;
	}
	
	public String toString() {
		return (super.toString() + " Operating: " + this.operating);
	}
	

}
