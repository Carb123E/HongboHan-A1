// Define a class named HealthProfessional
public class HealthProfessional {
    // Declare a private integer variable 'id' to store the ID of the health professional
    private int id;
    // Declare a private string variable 'name' to store the name of the health professional
    private String name;
    // Declare a private string variable 'description' to store the description of the health professional
    private String description;

    // Default constructor for HealthProfessional, initializes with no values
    public HealthProfessional() {}

    // Parameterized constructor for HealthProfessional, initializes with provided id, name, and description
    public HealthProfessional(int id, String name, String description) {
        // Assign the provided id to the instance variable 'id'
        this.id = id;
        // Assign the provided name to the instance variable 'name'
        this.name = name;
        // Assign the provided description to the instance variable 'description'
        this.description = description;
    }

    // Method to print the details of the health professional
    public void printDetails() {
        // Print the ID of the health professional
        System.out.println("ID: " + id);
        // Print the name of the health professional
        System.out.println("Name: " + name);
        // Print the description of the health professional
        System.out.println("Description: " + description);
    }
}
