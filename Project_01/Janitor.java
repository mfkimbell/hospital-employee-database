package Project_01;

public class Janitor extends Administrator {
	private String sweeping;
	public Janitor(String Type, String Name, String blazerID, String department, String sweeping) {
		super(Type, Name, blazerID, department);
		this.sweeping=sweeping;
	}
	public String getSweeping() {
		return this.sweeping;
	}
	public void setSweeping(String sweepinput) {
		this.sweeping = sweepinput;
	}
	/**
	 * This function outputs the name and blazerID of the current selected object.
	 * And then adds whether they are sweeping to the output.
	 * @return String
	 */
	public String toString() {
		return (super.toString() + "Sweeping: " + this.sweeping);
		}

}
