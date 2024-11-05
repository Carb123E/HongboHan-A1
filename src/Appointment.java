public class Appointment {
    // Variable to store the name of the patient
    private String patientName;
    // Variable to store the phone number of the patient
    private String phoneNumber;
    // Variable to store the preferred time for the appointment
    private String preferredTime;
    // Variable to store the health professional associated with the appointment
    private HealthProfessional healthProfessional;

    // Default constructor
    public Appointment() {}

    /**
     * Constructor to initialize all fields of the Appointment class.
     * @param patientName The name of the patient.
     * @param phoneNumber The phone number of the patient.
     * @param preferredTime The preferred time for the appointment.
     * @param healthProfessional The health professional associated with the appointment.
     */
    public Appointment(String patientName, String phoneNumber, String preferredTime, HealthProfessional healthProfessional) {
        this.patientName = patientName; // Assigning the patient's name to the instance variable
        this.phoneNumber = phoneNumber; // Assigning the patient's phone number to the instance variable
        this.preferredTime = preferredTime; // Assigning the preferred time for the appointment to the instance variable
        this.healthProfessional = healthProfessional; // Assigning the health professional to the instance variable
    }

    /**
     * Method to print the details of the appointment.
     * This includes the patient's name, phone number, preferred time, and details of the health professional.
     */
    public void printDetails() {
        // Printing the patient's name
        System.out.println("Patient Name: " + patientName);
        // Printing the patient's phone number
        System.out.println("Phone Number: " + phoneNumber);
        // Printing the preferred time for the appointment
        System.out.println("Preferred Time: " + preferredTime);
        // Printing a header for the health professional details
        System.out.println("Health Professional Details:");
        // Calling the printDetails method of the HealthProfessional class to print its details
        healthProfessional.printDetails();
    }

    /**
     * Getter method for the phone number of the patient.
     * @return The phone number of the patient.
     */
    public String getPhoneNumber() {
        return phoneNumber; // Returning the phone number of the patient
    }
}
