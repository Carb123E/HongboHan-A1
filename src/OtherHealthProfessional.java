public class OtherHealthProfessional extends HealthProfessional {
    private String type;

    public OtherHealthProfessional() {}

    public OtherHealthProfessional(int id, String name, String description, String type) {
        super(id, name, description);
        this.type = type;
    }
}
