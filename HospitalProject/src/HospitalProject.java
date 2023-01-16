/**
 * 
 * @author Isha Gadkari
 * 
 * <h1> HOSPITAL MANAGEMENT SYSTEM </h1>
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class HospitalProject{
	
	
	
	public static void main(String[]args) {
		
//..............................................................................	
// Creating Hospital object
		
		Hospital h = new Hospital();
		
//Details of the hospital:
		
		//h.HospitalInfo();
//..............................................................................
	/**
	 * <h2> PART 1: </h2>
	 * <p> <ul>
	 * <li>Creating Hospitalstaff, Doctor, and Nurse objects
	 * <li>Also assigning Nurses to HeadDoctor in the constructor itself
	 * <li>Adding them to the hospital or HospitalStaff-type arrayList 
	 * <li>Printing all the staff working in the hospital 
	 * </ul></p>
	 */
		
		Hospitalstaff hs1 = new Hospitalstaff("J100", "John", "Doe");
		Hospitalstaff hs2 = new Hospitalstaff("J101", "James", "Smith");
		Doctor d1 = new Doctor("A101", "Isha", "Gadkari", "Surgeon", true);
		Doctor d2 = new Doctor("A102", "Georgia", "Crane", "Therapist", false);
		Nurse n1 = new Nurse("N100", "Jessie", "Carter", d1);
		Nurse n2 = new Nurse("N101", "Maria", "Garcia", d2);
		
		h.addHospitalStaff(hs1);
		h.addHospitalStaff(hs2);
		h.addHospitalStaff(d1);
		h.addHospitalStaff(d2);
		h.addHospitalStaff(n1);
		h.addHospitalStaff(n2);
		
//to see all the hospital staff:
		
		//h.seeStaff();
		
//..................................................................................	
	/** 
	 * <h2> PART 2: </h2>
	 * <p> <ul>
	 * <li>Creating Patient objects
	 * <li>Adding Patient objects to the listOfPatients array list
	 * <li>Assigning them to different doctors 
	 * </ul></p>
	 */
				
		Patient p1 = new Patient("Z100", "Jonny", "Gate", "89607654", "101 Goodyear, AZ");
		Patient p2 = new Patient("Z101", "John", "Shelby", "24852948", "1776 Grand Avenue, St.Paul, MN");
		Patient p3 = new Patient("Z102", "Thomas", "Shelby", "84524750", "1553, Grand, Minneapolis, MN");
		Patient p4 = new Patient("Z103", "Arthur", "Shelby", "85084375", "1662, Finn Avenue, MN");	
		
		d1.addPatient(p1);
		d1.addPatient(p4);
		d2.addPatient(p3);
		d2.addPatient(p2);
		
	/*
	 * to see all patients assigned to doctor d1
	 */
		
		// d1.seePatient();
		
	/*
	 * to see all patients assigned to doctor d2
	 */
		
		// d2.seePatient();
		 
//.....................................................................................
	/**
	 * <h2> PART 3: </h2>
	 * Checking for appointments for a particular patient of a particular doctor
	 */
		 
		  //d1.checkAppointment(p4);
		  //d2.checkAppointment(p3);
		
	/*
	 * Finding information about a particular doctor
	 */
		
		//System.out.println(d1.getDoctorinfo());

//......................................................................................
	/**
	 * <h2> PART 4: </h2>
	 * Finding informaiton about a particular nurse
	 */
		
		// System.out.println(n1.getNurseInfo());
		
	/*
	 * Assigning Nurses to different doctors
	 */
		
	    //n1.assignToDoctor(d2);
		
//.........................................................................................
		
	/** 
	 * <h2> PART 5: </h2>
	 * <p> <ul>
	 * <li>Creating records for patients
	 * <li>printing information about that patient
	 * <li>Assigning a doctor to that patient
	 * </ul></p>
	 */
		Record r1 = new Record(p1, "heart attack" , 78);
		//System.out.println(r1.getPatientinfo());
		//r1.assignFamilyDoctor(d2);
	
//..........................................................................................
		
	/**
	 * <h2> PART 6: </h2>
	 * <p> <ul>
	 * <li>Changing the diagnosis of that patient: <br>
	 * It will ask the user to update the diagnositc information about that patient
	 * <li>printing updated patient information
	 * </ul></p>
	 */
		
		//r1.changeDiagnosis();
		//System.out.println(r1.getPatientinfo());
	
		
	}
}



/**
 *  <p> By creating an object of Hospital class, the user can add Hospital staff to the Arraylist called listofStaff by using the addHospital<br>
 *  staff method. <br>
 * 	The user can see all the staff in the hospital, and see hospital information such as the hospital name, contact information and address. </p>
 */
class Hospital{
	
	public String Hospitalname = "Red Cross";
	public String Contact = "84375204592";
	public String address = "1737 Cleveland Avenue, St. Paul, MN";
	
//Array List of type Hositalstaff called listofStaff created. 
	private List<Hospitalstaff>listofStaff = new ArrayList<Hospitalstaff>();
	
	
//arraylist.add() method from ArrayList package:
	public void addHospitalStaff(Hospitalstaff hs) {
		this.listofStaff.add(hs);
		
	}
	public void seeStaff() {
		for(Hospitalstaff staff:this.listofStaff) {
			System.out.println(staff);
		}
	}
	/**
	 * 
	 */
	public void HospitalInfo() {
		
		
		System.out.println(Hospitalname + "\nContact information: " + Contact + "\nAddress" + address);
	}
}



/**
 * 
 * <p> The Hospitalstaff class has 5 methods. It has a parameterized constuctor, thus when a HospitalStaff object is created, staffId, Firstname, <br>
 * and Lastname are parameters that have to be specified. It has a toString method which aids the seeStaff method in the Hospital class to print details <br>
 * of the staff instead of printing the address of the objects. <br>
 * Hospitalstaff allows the user to add patients to the arraylist called listofPatients. It also has a seePatient that prints details of the patients. </p>
 */
class Hospitalstaff{
	
	private String staffId;
	private String FirstName;
	private String LastName;
	
//Array List of type Patient called listOfPatients created. 
	private List<Patient>listOfPatients = new ArrayList<>();
	
	
	public String getstaffId() {
		return staffId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public  Hospitalstaff(String staffId, String FirstName, String LastName) {
		this.staffId = staffId;
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	
	public String toString() {
		return staffId + " " + FirstName + " " + LastName;
	}
	
	//arraylist.add() method from ArrayList package:
	public void addPatient(Patient p) {
		this.listOfPatients.add(p);	
	}
	
	public void seePatient() {
		for(Patient pat:listOfPatients) {
			System.out.println(pat);
		}
	}
		
}



/**
 * <p>The Patient class also has a parameterized contructor, thus, when creating an object of Patient class, the user will have to initialize <br>
 * the Id, firstname, lastname, phonenumber, and address of the patient. It has a toString method which is allow the seePatient method in <br>
 * the Hospitalstaff method to work, without which seeStaff would only print address of the arraylist. </p>
 */
	
class Patient{
	private String patientId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	public Patient(String patientId, String firstName, String lastName, String phoneNum, String address) {
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	public String getName() {
		return firstName + " " + lastName;
	}
	public String toString() {
		return patientId + " " + firstName + " " + lastName + " " + phoneNum + " " + address;
	}
}

/**
 * 
 * <p>The Record class has a parameterized constructor that takes in an object of class Patient, the diagnosis of the Patient, and the age of the Patient. <br>
 * It has a method that gets information about the patient such as all the information taken by the parameters of Patient class contructors, the diagnosis, <br>
 * the age of the patient, and the doctor assigned to the patient. <br>
 * It has a method called changeDiagnosis which prompts the user to input the changed diagnosis of the patient. It also has a method that assigns the patient a doctor.</p> 
 *
 */

class Record{
	private String diagnosis;
	private int age;
	private Patient p;
	private Doctor familyDoctor;

/**
 * <p> This constructor takes an instance of class Patient. This specifies which Patient or which Patient object the diagnosis and the <br>
 * age which is entered when creating a Record or an object of class record is stored for. 
 * </p>
 */
	Record(Patient p, String diagnosis, int age){
		this.p = p;
		this.diagnosis = diagnosis;
		this.age = age;
	}
	
	public String getPatientinfo() {
		return p + " " + age + " " + diagnosis + " \nDoctor assigned: " + familyDoctor;
	}
	
	public void changeDiagnosis() {
		System.out.println("Please enter the new diagnosis");
		Scanner s = new Scanner(System.in);
		this.diagnosis = s.nextLine();
	}
// The parameter is an instance of the class Doctor. This specifies which doctor or Doctor object the patient is assigned to. 
	public void assignFamilyDoctor(Doctor d) {
		this.familyDoctor = d;
	}
	
}




/**
 * 
 * <p>The Doctor class is a child class of Hospitalstaff, thereby inheriting all variables and methods in the Hospitalstaff class. <br>
 * Doctor is-a Hospitalstaff. The Doctor class has a parameterized constuctor which takes in the ID of the staff, the first name, the last <br> 
 * name, speciality, and the appointment status of the Doctor.
 * <br> The getDoctorinfo method returns the ID, first and last name, the speciality of the doctor, and whether the doctor has appointments available or not.   
 *<br> the checkappointments returns the patient's name and whether or not they can get an appointment with a particular doctor.  </p>
 */

class Doctor extends Hospitalstaff{
	private String speciality;
	private boolean appointmentStatus;
	// appointmentStatus == true means appointments are available. 
	//appointmentStatus == false means appointments are not available.
	
	
	public Doctor(String staffId, String FirstName, String LastName, String speciality, boolean appointmentStatus) {
		super(staffId, FirstName, LastName);
		this.speciality = speciality;
		this.appointmentStatus = appointmentStatus;	
	}
	 
	public String getDoctorinfo() {
		if(appointmentStatus == true) {
			return getstaffId() + " - " + getFirstName() + " " + getLastName() + "- " + speciality + " -Appointments available " ;
		}
		else {
			return getstaffId() + " - " + getFirstName() + " " + getLastName() + "- " + speciality + " -Appointments not available " ;
		}	
 	}
//The parameter of this method takes an instance of class Patient so that methods from that class can be evoked in this method. 	
	public void checkAppointment(Patient p) {
		if(this.appointmentStatus == true) {
			System.out.println(p.getName() + " can get an appointment with doctor " + getFirstName() + " " + getLastName());
		}
		else {
			System.out.println("All appointments for this doctor are full.");
		}
	}
	
	
}
 


/**
 * <p> The Nurse class is another child class of the parent class Hospitalstaff. Nurse is-a Hospitalstaff. <br>
 * It also has a parameterized constructor which takes in the ID, the first and last name, and an object of class Doctor. <br>
 * The object of class Doctor in the parameterized constructor is the Doctor the nurse is initially assinged to. <br>
 * The getNurseInfo returns all the information that was asked in the parameterized constructor. <br>
 * This class also has another method which reassigns the nurse a Head Doctor.  </p>
 */
class Nurse extends Hospitalstaff{
	private Doctor HeadDoctor;
	
	
	public Nurse(String staffId, String FirstName, String LastName, Doctor HeadDoctor) {
		super(staffId, FirstName, LastName);
		this.HeadDoctor = HeadDoctor;
	}
	
	public String getNurseInfo() {
		return getstaffId() + " " + getFirstName() + " " + getLastName() + "\n Head Doctor: " + HeadDoctor;
	}
//the parameter of this method takes an instance of class Doctor thereby assinging the Nurse to this particular doctor. 
	public void assignToDoctor(Doctor d) {
		this.HeadDoctor = d;
	}
}