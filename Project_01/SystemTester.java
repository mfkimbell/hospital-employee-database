package Project_01;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class SystemTester {

	// creating an arraylist called "arrayList1"

	private ArrayList<Doctor> doctors = new ArrayList<>();
	private ArrayList<Administrator> administrators = new ArrayList<>();
	private ArrayList<IT> IT = new ArrayList<>();
	private ArrayList<Janitor> janitors = new ArrayList<>();
	private ArrayList<Nurse> nurses = new ArrayList<>();
	private ArrayList<Receptionist> receptionists = new ArrayList<>();
	private ArrayList<Surgeon> surgeons = new ArrayList<>();
	private ArrayList<HospitalEmployee> hospitalemployees = new ArrayList<>();

	private ArrayList<ArrayList> masterList = new ArrayList<ArrayList>();

	private Integer count = 0;

	public ArrayList<Doctor> getDoctors() {
		return this.doctors;
	}

	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	public ArrayList<Administrator> getAdministrators() {
		return administrators;
	}

	public void setAdministrators(ArrayList<Administrator> administrators) {
		this.administrators = administrators;
	}

	public ArrayList<IT> getIT() {
		return IT;
	}

	public void setIT(ArrayList<IT> iT) {
		IT = iT;
	}

	public ArrayList<Janitor> getJanitors() {
		return janitors;
	}

	public void setJanitors(ArrayList<Janitor> janitors) {
		this.janitors = janitors;
	}

	public ArrayList<Nurse> getNurses() {
		return nurses;
	}

	public void setNurses(ArrayList<Nurse> nurses) {
		this.nurses = nurses;
	}

	public ArrayList<Receptionist> getReceptionists() {
		return receptionists;
	}

	public void setReceptionists(ArrayList<Receptionist> receptionists) {
		this.receptionists = receptionists;
	}

	public ArrayList<Surgeon> getSurgeons() {
		return surgeons;
	}

	public void setSurgeons(ArrayList<Surgeon> surgeons) {
		this.surgeons = surgeons;
	}

	public ArrayList<HospitalEmployee> getHospitalemployees() {
		return hospitalemployees;
	}

	public void setHospitalemployees(ArrayList<HospitalEmployee> hospitalemployees) {
		this.hospitalemployees = hospitalemployees;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public ArrayList<ArrayList> getMasterList() {
		return masterList;
	}

	public void setMasterList(ArrayList<ArrayList> masterList) {
		this.masterList = masterList;
	}

	public static void main(String[] args) {

		SystemTester test = new SystemTester();

		// access uabEmployee.txt
		try (Scanner fileScanner = new Scanner(Paths.get("uabEmployee.txt"))) {

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				String[] lineVars = line.split(" ");
				test.setCount(test.getCount() + 1);

				if (lineVars[0].equals("D")) {
					// String Type, String Name, String blazerID, String Speciality
					Doctor newDoc = new Doctor(lineVars[0], lineVars[1], lineVars[2], lineVars[3]);
					test.getDoctors().add(newDoc);
//					this.doctors.add(newDoc); these wouldn't work
//					doctors.add(newDoc);
				} else if (lineVars[0].equals("N")) {
					Nurse newNurse = new Nurse(lineVars[0], lineVars[1], lineVars[2], lineVars[3]);
					test.getNurses().add(newNurse);

				} else if (lineVars[0].equals("A")) {
					Administrator newAdministrator = new Administrator(lineVars[0], lineVars[1], lineVars[2],
							lineVars[3]);
					test.getAdministrators().add(newAdministrator);

				} else if (lineVars[0].equals("R")) {
					Receptionist newReceptionist = new Receptionist(lineVars[0], lineVars[1], lineVars[2], lineVars[3],
							lineVars[4]);
					test.getReceptionists().add(newReceptionist);

				} else if (lineVars[0].equals("J")) {
					Janitor newJanitor = new Janitor(lineVars[0], lineVars[1], lineVars[2], lineVars[3], lineVars[4]);
					test.getJanitors().add(newJanitor);

				} else if (lineVars[0].equals("S")) {
					Surgeon newSurgeon = new Surgeon(lineVars[0], lineVars[1], lineVars[2], lineVars[3], lineVars[4]);
					test.getSurgeons().add(newSurgeon);

				} else if (lineVars[0].equals("I")) {
					IT newIT = new IT(lineVars[0], lineVars[1], lineVars[2], lineVars[3]);
					test.getIT().add(newIT);

				} else if (lineVars[0].equals("E")) {
					HospitalEmployee newHospitalEmployee = new HospitalEmployee(lineVars[0], lineVars[1], lineVars[2]);
					test.getHospitalemployees().add(newHospitalEmployee);

				} else { // if it's nothing

				}

			}
			fileScanner.close();

		} catch (Exception e) {
			System.out.println("Error: " + e.toString());

		}

		test.getMasterList().add(test.getHospitalemployees());
		test.getMasterList().add(test.getDoctors());
		test.getMasterList().add(test.getAdministrators());
		test.getMasterList().add(test.getJanitors());
		test.getMasterList().add(test.getNurses());
		test.getMasterList().add(test.getReceptionists());
		test.getMasterList().add(test.getSurgeons());

		
		
		

		test.Menu();

		

	}

	/**
	 * This function pulls up the display menu so the user can access the other
	 * methods.
	 */
	public void Menu() {
		System.out.println("Welcome to the UAB Hospital Employee System." + "\n");
		System.out.println("Please Select From the following options." + "\n");
		System.out.println("Type '1' to Display the Employee List.");
		System.out.println("Type '2' to Add an Employee.");
		System.out.println("Type '3' to Update the Database.");
		System.out.println("Type '4' to Delete an Employee.");

		Scanner menuScanner = new Scanner(System.in);
		while (menuScanner.hasNextLine()) {

			String menuline = menuScanner.nextLine();

			if (menuline.equals("1")) {

				employeeList();

			} else if (menuline.equals("2")) {
				addEmployee(menuScanner);

			} else if (menuline.equals("3")) {
				updateDatabase();
			} else if (menuline.equals("4")) {
				deleteEmployee(menuScanner);

			} else {
				System.out.println("Invalid input, please type 1, 2, 3, or 4.");

			}
		}
		menuScanner.close();

	}

	/**
	 * This is going to open uabEmployee.txt, iterate through each UPDATED list of
	 * positions, and write each employee and position into a cleared version of
	 * uabEmployee.txt in the format that matches the original uabEmployee.txt.
	 */
	public void updateDatabase() {
		try {
			PrintWriter out = new PrintWriter("uabEmployee.txt");

			for (HospitalEmployee d : hospitalemployees) {
				out.print("E " + d.getName() + " " + d.getBlazerID() + "\n");
			}
			for (Doctor d : doctors) {
				out.print("D " + d.getName() + " " + d.getBlazerID() + " " + d.getSpecialty() + "\n");
			}
			for (Nurse d : nurses) {
				out.print("N " + d.getName() + " " + d.getBlazerID() + " " + d.getNumpat() + "\n");
			}
			for (Surgeon d : surgeons) {
				out.print("S " + d.getName() + " " + d.getBlazerID() + " " + d.getSpecialty() + " " + d.getOperating()
						+ "\n");
			}
			for (Administrator d : administrators) {
				out.print("A " + d.getName() + " " + d.getBlazerID() + " " + d.getDepartment() + "\n");
			}
			for (Receptionist d : receptionists) {
				out.print("R " + d.getName() + " " + d.getBlazerID() + " " + d.getDepartment() + " " + d.getAnswering()
						+ "\n");
			}
			for (Janitor d : janitors) {
				out.print("J " + d.getName() + " " + d.getBlazerID() + " " + d.getDepartment() + " " + d.getSweeping()
						+ "\n");
			}
			for (IT d : IT) {
				out.print("I " + d.getName() + " " + d.getBlazerID() + " " + d.getTeam() + "\n");
			}

			out.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("\n" + "Updating database..." + "\n");
		System.out.println("Returning to menu." + "\n");

		Menu();

	}

	/**
	 * This function iterates through each list of employees and prints them out for
	 * the user to see. It uses a format that is more understandable than the
	 * original uabEmployee.txt file.
	 * return String
	 */
	public void employeeList() {

		System.out.println("The UAB Hospital System has the following employees: " + "\n");

		System.out.println("Total Number of employees = " + count + "\n");

		System.out.println("Hospital Employees: " + hospitalemployees.size());
		for (HospitalEmployee s : hospitalemployees) {
			System.out.println(s.toString());
		}
		System.out.println("");

		System.out.println("Doctors: " + doctors.size());
		for (Doctor s : doctors) {
			System.out.println(s.toString());
		}
		System.out.println("");

		System.out.println("Surgeons: " + hospitalemployees.size());
		for (Surgeon s : surgeons) {
			System.out.println(s.toString());
		}
		System.out.println("");

		System.out.println("Nurses: " + nurses.size());
		for (Nurse s : nurses) {
			System.out.println(s.toString());
		}
		System.out.println("");

		System.out.println("Administrators: " + administrators.size());
		for (Administrator s : administrators) {
			System.out.println(s.toString());
		}
		System.out.println("");

		System.out.println("Receptionists: " + receptionists.size());
		for (Administrator s : administrators) {
			System.out.println(s.toString());
		}
		System.out.println("");
		System.out.println("Returning to Menu..."+"\n");
		Menu();
	}

	/**
	 * 
	 * @param scanner (which will be the scanner from the Menu() function) 
	 *                This function asks for user input based on the position type, and
	 *                then creates an object of the correction position type and
	 *                adds it to the list of that position type.
	 * 
	 */

	public void addEmployee(Scanner scanner) {

		ArrayList<String> info = new ArrayList<String>();

		System.out.println(
				"What is the position title of the new employee? Please type the number that corresponds to the correct position. Or type '9' to return to the menu."
						+ "\n");
		System.out.println("1: HospitalEmployee" + "\n");
		System.out.println("2: Doctor" + "\n");
		System.out.println("3: Surgeon" + "\n");
		System.out.println("4: Nurse" + "\n");
		System.out.println("5: Administrator" + "\n");
		System.out.println("6: Receptionist" + "\n");
		System.out.println("7: Janitor" + "\n");
		System.out.println("8: IT Team" + "\n");
		System.out.println("9: return to Menu" + "\n");
		System.out.println("New Employee position: ");

		Scanner fileScanner = scanner;
		String line = fileScanner.nextLine();

		if (line.equals("1")) {
			info.add("E");
		} else if (line.equals("2")) {
			info.add("D");
		} else if (line.equals("3")) {
			info.add("S");
		} else if (line.equals("4")) {
			info.add("N");
		} else if (line.equals("5")) {
			info.add("A");
		} else if (line.equals("6")) {
			info.add("R");
		} else if (line.equals("7")) {
			info.add("J");
		} else if (line.equals("8")) {
			info.add("I");
		} else if (line.equals("9")) {
			Menu();
		} else {
			System.out.println("Selection not valid, please enter a number 1-9." + "\n");
			addEmployee(scanner);
		}

		System.out.println("Please type the name of the employee: ");
		String line2 = fileScanner.nextLine();
		info.add(line2);

		System.out.println("Please type the employee's BlazerId: ");
		String line3 = fileScanner.nextLine();

		info.add(line3);

		if (line.equals("1")) {

		} else if (line.equals("2")) {
			System.out.println("Please type the Doctor's Specialty: ");
			String line4 = fileScanner.nextLine();

			info.add(line4);

		} else if (line.equals("3")) {
			System.out.println("Please type the Surgeon's Specialty: ");
			String line4 = fileScanner.nextLine();
			info.add(line4);
			System.out.println("Please type 'Y' if the surgeon is operating and 'N' if not: ");
			String line5 = fileScanner.nextLine();
			info.add(line5);

		} else if (line.equals("4")) {
			System.out.println("Please type the Number of Patients this Nurse has: ");
			String line4 = fileScanner.nextLine();
			info.add(line4);

		} else if (line.equals("5")) {
			System.out.println("Please type this employee's Department: ");
			String line4 = fileScanner.nextLine();
			info.add(line4);

		} else if (line.equals("6")) {
			System.out.println("Please type this employee's Department: ");
			String line4 = fileScanner.nextLine();
			info.add(line4);

			System.out.println("Please type 'Y' if this Receptionist and 'N' if they are not: ");
			String line5 = fileScanner.nextLine();
			info.add(line5);

		} else if (line.equals("7")) {
			System.out.println("Please type this employee's Department: ");
			String line4 = fileScanner.nextLine();
			info.add(line4);
			System.out.println("Please type 'Y' if this janitor is sweeping and 'N' if they are not: ");
			String line5 = fileScanner.nextLine();
			info.add(line5);

		} else if (line.equals("8")) {
			System.out.println("Please type which IT team this employee belongs to: ");
			String line4 = fileScanner.nextLine();
			info.add(line4);

		}

		if (info.get(0).equals("D")) {
			Doctor newDoc = new Doctor(info.get(0), info.get(1), info.get(2), info.get(3));
			getDoctors().add(newDoc);
//			this.doctors.add(newDoc); these wouldn't work
//			doctors.add(newDoc);
		} else if (info.get(0).equals("N")) {
			Nurse newNurse = new Nurse(info.get(0), info.get(1), info.get(2), info.get(3));
			getNurses().add(newNurse);

		} else if (info.get(0).equals("A")) {
			Administrator newAdministrator = new Administrator(info.get(0), info.get(1), info.get(2), info.get(3));
			getAdministrators().add(newAdministrator);

		} else if (info.get(0).equals("R")) {
			Receptionist newReceptionist = new Receptionist(info.get(0), info.get(1), info.get(2), info.get(3),
					info.get(4));
			getReceptionists().add(newReceptionist);

		} else if (info.get(0).equals("J")) {
			Janitor newJanitor = new Janitor(info.get(0), info.get(1), info.get(2), info.get(3), info.get(4));
			getJanitors().add(newJanitor);

		} else if (info.get(0).equals("S")) {
			Surgeon newSurgeon = new Surgeon(info.get(0), info.get(1), info.get(2), info.get(3), info.get(4));
			getSurgeons().add(newSurgeon);

		} else if (info.get(0).equals("I")) {
			IT newIT = new IT(info.get(0), info.get(1), info.get(2), info.get(3));
			getIT().add(newIT);

		} else if (info.get(0).equals("E")) {
			HospitalEmployee newHospitalEmployee = new HospitalEmployee(info.get(0), info.get(1), info.get(2));
			getHospitalemployees().add(newHospitalEmployee);

		}

		System.out.println("Employee info: " + info);
		System.out.println("Employee Sucessfully Added. Returning to Menu." + "\n");
		System.out.println("");

		Menu();
		fileScanner.close();

	}

	/**
	 * 
	 * @param scanner (which will be the scanner from the Menu() function) This
	 *                function asks the user for a blazerID input, then searches
	 *                through all of the position lists for a matching blazerID. If
	 *                a match is found, then it deletes that employee from the list.
	 */
	public void deleteEmployee(Scanner scanner) {

		Scanner fileScanner3 = scanner;

		System.out.println("Please type the employee's BlazerId: ");
		String line1 = fileScanner3.nextLine();

		for (HospitalEmployee d : hospitalemployees) {
			if (d.getBlazerID().equals(line1)) {
				hospitalemployees.remove(d);
				System.out.println("Hospital Employee removed."+"\n");
				break;
			}
		}
		for (Doctor d : doctors) {
			if (d.getBlazerID().equals(line1)) {
				doctors.remove(d);
				System.out.println("Doctor removed."+"\n");
				break;

			}

		}
		for (Surgeon d : surgeons) {
			if (d.getBlazerID().equals(line1)) {
				surgeons.remove(d);
				System.out.println("Surgeon removed."+"\n");
				break;

			}
		}
		for (Nurse d : nurses) {
			if (d.getBlazerID().equals(line1)) {
				nurses.remove(d);
				System.out.println("Nurse removed."+"\n");
				break;

			}

		}
		for (Administrator d : administrators) {
			if (d.getBlazerID().equals(line1)) {
				administrators.remove(d);
				System.out.println("Administrator removed."+"\n");
				break;

			}
		}
		for (Receptionist d : receptionists) {
			if (d.getBlazerID().equals(line1)) {
				receptionists.remove(d);
				System.out.println("Receptionist removed."+"\n");
				break;

			}

		}
		for (Janitor d : janitors) {
			if (d.getBlazerID().equals(line1)) {
				janitors.remove(d);
				System.out.println("Janitor removed."+"\n");
				break;

			}
		}
		for (IT d : IT) {
			if (d.getBlazerID().equals(line1)) {
				IT.remove(d);
				System.out.println("IT employee removed."+"\n");
				break;

			}

		}
		System.out.println("Returning to menu..."+"\n");
		Menu();

	}
}
