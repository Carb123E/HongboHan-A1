public class Appointment {
    private String patientName;
    private String phoneNumber;
    private String preferredTime;
    private HealthProfessional healthProfessional;

    public Appointment() {}

    public Appointment(String patientName, String phoneNumber, String preferredTime, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.phoneNumber = phoneNumber;
        this.preferredTime = preferredTime;
        this.healthProfessional = healthProfessional;
    }

    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Preferred Time: " + preferredTime);
        System.out.println("Health Professional Details:");
        healthProfessional.printDetails();
    }
}
