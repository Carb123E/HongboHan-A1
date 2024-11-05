// Define a class GeneralPractitioner that extends HealthProfessional
public class GeneralPractitioner extends HealthProfessional {
    // Declare a private string variable specialization to store the specialization of the general practitioner
    private String specialization;

    // Default constructor for GeneralPractitioner
    public GeneralPractitioner() {}

    // Parameterized constructor for GeneralPractitioner, initializes id, name, description from superclass and specialization
    public GeneralPractitioner(int id, String name, String description, String specialization) {
        // Call the superclass (HealthProfessional) constructor with id, name, and description
        super(id, name, description);
        // Initialize the specialization field with the provided value
        this.specialization = specialization;
    }

    // Override the printDetails method from HealthProfessional
    @Override
    public void printDetails() {
        // Call the superclass's printDetails method to print common details
        super.printDetails();
        // Print the specialization of the general practitioner
        System.out.println("Specialization: " + specialization);
        // Print the type of health professional
        System.out.println("Type: General Practitioner");
    }
}
