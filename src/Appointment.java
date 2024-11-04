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
}
