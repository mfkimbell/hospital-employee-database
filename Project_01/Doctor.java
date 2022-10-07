package Project_01;

public class Doctor extends HospitalEmployee {
	private String Speciality;
	public Doctor(String Type, String Name, String blazerID, String Speciality) {
		super(Type, Name, blazerID);
		this.Speciality=Speciality;
	}
	
	public String toString() {
		return (super.toString() + " Speciality: " + this.Speciality);
	}
	
	
	
	public String getSpecialty() {
		return Speciality;
	}
	public void setSpecialty(String specialinput) {
		this.Speciality = specialinput; 
	}



}
