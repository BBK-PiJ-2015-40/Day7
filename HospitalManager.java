public class Hospital Manager{
	private Patient patientListStart = null;
	
	public static void main(String[] args){
		HospitalManager hm = new HospitalManager();	
	}
	
	Patient firstPatient = new Patient("John", 33, "Tuberculosis");
	Patient secondPatient = new Patient("Ali", 23, "Tuberculosis");
	Patient thirdPatient = new Patient("David", 34, "Tuberculosis");
	Patient fourthPatient = new Patient("Fatma", 19, "Tuberculosis");
	Patient fifthPatient = new Patient("Cem", 27, "Tuberculosis");
	
	patientListStart = firstPatient;
	patientListStart = secondPatient;
	patientListStart = thirdPatient;
	patientListStart = fourthPatient;
	patientListStart = fifthPatient;
	
}