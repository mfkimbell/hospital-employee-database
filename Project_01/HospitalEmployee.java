package Project_01;

public class HospitalEmployee {
	private String jobType;
	private String blazerID;
	private String name;

	public HospitalEmployee(String Type, String Name, String blazerID) {
		this.blazerID = blazerID;
		this.name=Name;
		this.jobType = Type;
		
	}
	
	
	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getBlazerID() {
		return blazerID;
	}

	public void setBlazerID(String blazerID) {
		this.blazerID = blazerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This function outputs the name and blazerID of the current selected HospitalEmployee object.
	 */
	public String toString() {
		return ("Name: " + this.name + " BlazerID: " + this.blazerID);
	}
	
	
	
	

}
