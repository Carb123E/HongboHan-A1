public class AssignmentOne {
    public static void main(String[] args) {
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
    }
}
