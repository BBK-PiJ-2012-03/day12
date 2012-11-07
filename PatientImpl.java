public class PatientImpl {
  private String name;
  private int age;
  private String illness;
  private PatientImpl nextPatient;
  private PatientImpl previousPatient;

	public PatientImpl(String name, int age, String illness) {
	this.name = name;
	this.age = age;
	this.illness = illness;
	this.nextPatient = null;
	this.previousPatient = null;
	}

	public void addPatient(PatientImpl newPatient) {
		if (this.nextPatient == null) {
		// this means this is the last patient in the list
		this.nextPatient = newPatient;
		newPatient.previousPatient = this;
		} else {
		  this.nextPatient.addPatient(newPatient);
		  }
	}

	public boolean deletePatient(PatientImpl patient) {
	  if (this.nextPatient == null) {
	  //patient to remove was not found
	  return false;
	} else if (this.nextPatient.name.equals(patient.name)) {
	  //We found it! It is the next one!
	  // Now link this patient to the one after the next, and the one after the next, to this.
	  this.nextPatient = nextPatient.nextPatient;
	  this.nextPatient.previousPatient = this;
	  return true;
	} else {
	  return this.nextPatient.deletePatient(patient);
	  }
	}

		public void traverseForward(PatientImpl myPatient) {

			 while (myPatient != null) {
				System.out.println(myPatient.name + ", " + myPatient.age + ", " + myPatient.illness);
				myPatient = myPatient.nextPatient;
			}
		}

		public void traverseBackward(PatientImpl myPatient) {

			while (myPatient != null) {
				System.out.println(myPatient.name + ", " + myPatient.age + ", " + myPatient.illness); 
				myPatient = myPatient.previousPatient; 
			}
		}
}		