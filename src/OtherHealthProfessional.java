// Define a class named OtherHealthProfessional that extends HealthProfessional
public class OtherHealthProfessional extends HealthProfessional {
    // Declare a private string variable 'type' to store the type of the other health professional
    private String type;

    // Default constructor for OtherHealthProfessional, initializes with no values
    public OtherHealthProfessional() {}

    // Parameterized constructor for OtherHealthProfessional, initializes with provided id, name, description, and type
    public OtherHealthProfessional(int id, String name, String description, String type) {
        // Call the superclass (HealthProfessional) constructor with id, name, and description
        super(id, name, description);
        // Assign the provided type to the instance variable 'type'
        this.type = type;
    }

    // Override the printDetails method from HealthProfessional
    @Override
    public void printDetails() {
        // Call the superclass's printDetails method to print common details
        super.printDetails();
        // Print the type of the other health professional
        System.out.println("Type: " + type);
    }
}
