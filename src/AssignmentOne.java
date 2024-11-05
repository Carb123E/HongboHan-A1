import java.util.ArrayList; // Import the ArrayList class from the Java utility package
import java.util.Iterator; // Import the Iterator interface from the Java utility package
import java.util.List; // Import the List interface from the Java utility package

public class AssignmentOne {
    // Declare a static list of Appointment objects to store all appointments
    public static List<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3: Create instances of GeneralPractitioner and OtherHealthProfessional
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "Experienced in general practice", "Internal Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "Specializes in pediatrics", "Pediatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Williams", "Expert in family medicine", "Family Medicine");

        OtherHealthProfessional ohp1 = new OtherHealthProfessional(4, "Dr. Brown", "Surgical expert", "Surgeon");
        OtherHealthProfessional ohp2 = new OtherHealthProfessional(5, "Dr. Davis", "Nutritional expert", "Nutritionist");

        // Print details of each health professional
        gp1.printDetails();
        System.out.println("-------------------------------------");
        gp2.printDetails();
        System.out.println("-------------------------------------");
        gp3.printDetails();
        System.out.println("-------------------------------------");
        ohp1.printDetails();
        System.out.println("-------------------------------------");
        ohp2.printDetails();
        System.out.println("-------------------------------------");

        // Part 5: Create and manage appointments
        createAppointment(appointments, "John Doe", "1234567890", "08:00", gp1);
        createAppointment(appointments, "Jane Smith", "0987654321", "09:00", gp2);
        createAppointment(appointments, "Alice Brown", "1122334455", "10:00", ohp1);
        createAppointment(appointments, "Bob Davis", "6677889900", "11:00", ohp2);

        // Print existing appointments
        printExistingAppoints(appointments);

        // Cancel an appointment by phone number
        cancelBooking(appointments, "1234567890");

        // Print remaining appointments after cancellation
        printExistingAppoints(appointments);
    }

    /**
     * Creates an appointment and adds it to the list of appointments.
     * @param appointments The list of appointments.
     * @param patientName The name of the patient.
     * @param phoneNumber The phone number of the patient.
     * @param preferredTime The preferred time for the appointment.
     * @param healthProfessional The health professional assigned to the appointment.
     */
    public static void createAppointment(List<Appointment> appointments, String patientName, String phoneNumber, String preferredTime, HealthProfessional healthProfessional) {
        // Create a new Appointment object with the provided details
        Appointment appointment = new Appointment(patientName, phoneNumber, preferredTime, healthProfessional);
        // Add the new appointment to the list of appointments
        appointments.add(appointment);
    }

    /**
     * Prints the details of all existing appointments in the list.
     * @param appointments The list of appointments.
     */
    public static void printExistingAppoints(List<Appointment> appointments) {
        // Check if the list of appointments is empty
        if (appointments.isEmpty()) {
            // Print a message indicating no existing appointments
            System.out.println("No existing appointments.");
        } else {
            // Iterate through the list of appointments and print their details
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("----------------");
            }
        }
    }

    /**
     * Cancels an appointment based on the patient's phone number.
     * @param appointments The list of appointments.
     * @param phoneNumber The phone number of the patient whose appointment is to be cancelled.
     */
    public static void cancelBooking(List<Appointment> appointments, String phoneNumber) {
        // Create an iterator for the list of appointments
        Iterator<Appointment> iterator = appointments.iterator();
        boolean found = false; // Flag to indicate if an appointment was found and removed
        // Iterate through the list of appointments
        while (iterator.hasNext()) {
            // Get the next appointment in the list
            Appointment appointment = iterator.next();
            // Check if the current appointment matches the given phone number
            if (appointment.getPhoneNumber().equals(phoneNumber)) {
                // Remove the matching appointment from the list
                iterator.remove();
                found = true; // Set the flag to true indicating an appointment was found and removed
                break; // Exit the loop as we have already found and removed the appointment
            }
        }
        // If no appointment was found with the given phone number, print a message indicating so
        if (!found) {
            System.out.println("No appointment found with the given phone number.");
        }
    }
}
