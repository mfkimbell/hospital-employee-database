package Project_01;

public class Nurse extends HospitalEmployee {
	private String numpat;
	public Nurse(String Type, String Name, String blazerID, String numpat) {
		super(Type, Name, blazerID);
		this.numpat = numpat;
	}
	public String getNumpat() {
		return this.numpat;
	}
	public void setnumpat(String numpatinput) {
		this.numpat = numpatinput;
	}
	
	public String toString() {
		return (super.toString() + " Number of Patients; " + this.numpat);
		}
	

}
