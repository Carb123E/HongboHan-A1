import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AssignmentOne {
    public static List<Appointment> appointments = new ArrayList<>();
    public static void main(String[] args) {
        //Part 3
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "Experienced in general practice", "Internal Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "Specializes in pediatrics", "Pediatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Williams", "Expert in family medicine", "Family Medicine");

        OtherHealthProfessional ohp1 = new OtherHealthProfessional(4, "Dr. Brown", "Surgical expert", "Surgeon");
        OtherHealthProfessional ohp2 = new OtherHealthProfessional(5, "Dr. Davis", "Nutritional expert", "Nutritionist");

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

        //Part 5
        createAppointment(appointments, "John Doe", "1234567890", "08:00", gp1);
        createAppointment(appointments, "Jane Smith", "0987654321", "09:00", gp2);
        createAppointment(appointments, "Alice Brown", "1122334455", "10:00", ohp1);
        createAppointment(appointments, "Bob Davis", "6677889900", "11:00", ohp2);
        printExistingAppoints(appointments);
        cancelBooking(appointments, "1234567890");
        printExistingAppoints(appointments);
    }

    public static void createAppointment(List<Appointment> appointments, String patientName, String phoneNumber, String preferredTime, HealthProfessional healthProfessional) {
        Appointment appointment = new Appointment(patientName, phoneNumber, preferredTime, healthProfessional);
        appointments.add(appointment);
    }

    public static void printExistingAppoints(List<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("----------------");
            }
        }
    }

    public static void cancelBooking(List<Appointment> appointments, String phoneNumber) {
        Iterator<Appointment> iterator = appointments.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Appointment appointment = iterator.next();
            if (appointment.getPhoneNumber().equals(phoneNumber)) {
                iterator.remove();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with the given phone number.");
        }
    }
}
