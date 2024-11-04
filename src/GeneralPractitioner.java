public class GeneralPractitioner extends HealthProfessional {
    private String specialization;

    public GeneralPractitioner() {}

    public GeneralPractitioner(int id, String name, String description, String specialization) {
        super(id, name, description);
        this.specialization = specialization;
    }
}

