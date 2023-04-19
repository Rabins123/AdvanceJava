public class Hospital {
    private String name;
    private String location;
    private int numBeds;
    private boolean isEmergencyServicesAvailable;

    //constructor with parameters
    public Hospital(String name, String location, int numBeds, boolean isEmergencyServicesAvailable) {
        this.name = name;
        this.location = location;
        this.numBeds = numBeds;
        this.isEmergencyServicesAvailable = isEmergencyServicesAvailable;
      }

   // Method to display hospital information
   public void displayInfo() {
    System.out.println("Name: " + this.name);
    System.out.println("Location: " + this.location);
    System.out.println("Number of beds: " + this.numBeds);
    System.out.println("Emergency services available: " + (this.isEmergencyServicesAvailable ? "Yes" : "No"));
  }
  // Method to admit a patient to the hospital
  public void admitPatient(String patientName) {
    if (this.numBeds > 0) {
      System.out.println("Patient " + patientName + " admitted to the hospital.");
      this.numBeds--;
    } else {
      System.out.println("Sorry, no beds available.");
    }
  }
}
  
class HospitalTest{
    public static void main(String[] args){
        Hospital hs=new  Hospital("Apolo","Gorakhpur",200,true); 
        hs.displayInfo();
        hs.admitPatient("Kunnal");
    }
}
