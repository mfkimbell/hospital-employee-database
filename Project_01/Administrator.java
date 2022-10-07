package Project_01;

public class Administrator extends HospitalEmployee {
	private String department;
	
	public Administrator(String Type, String Name, String blazerID, String department) {
		super(Type, Name, blazerID);
		this.department=department;
		
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String depinput) {
		this.department = depinput;
	}
	
	/**
	 * This function outputs the name and blazerID of the current selected object.
	 * And then adds the department to the output.
	 * @return a String
	 */
	public String toString() {
		return (super.toString() + " Department: " + this.department);
		}
	


}
