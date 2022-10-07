package Project_01;

public class IT extends HospitalEmployee {
	private String team;
	
	public IT(String Type, String Name, String blazerID, String team) {
		super(Type, Name, blazerID); 
		this.team=team;
		}
	public String getTeam() {
		return this.team;
	}
	public void setTeam(String teaminput) {
		this.team = teaminput;
	}
	
	public String toString() {
		return (super.toString() + "Team: " + this.team);
	}
		
	}


