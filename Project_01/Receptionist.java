package Project_01;

public class Receptionist extends Administrator {
	private String answering;
	public Receptionist(String Type, String Name, String blazerID, String department, String answering) {
		super(Type, Name, blazerID, department);
		this.answering=answering;
	}
	public String getAnswering() {
		return this.answering;
	}
	public void setnumpat(String answerinput) {
		this.answering = answerinput;
	}
	
	public String toString() {
		return (super.toString() + "Answering; " + this.answering);
		}

}
