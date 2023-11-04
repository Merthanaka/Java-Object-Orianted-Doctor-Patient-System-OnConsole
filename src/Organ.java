public class Organ {
    private String name;
    private String medicalcondition;

    public Organ(String name,String medicalcondition) {
        this.name = name;
        this.medicalcondition = medicalcondition;

    }
    public void getDetails(){
        System.out.println("Name: "+this.getName());
        System.out.println("Medical Condition: "+this.medicalcondition);

    }

    public String getMedicalcondition() {
        return medicalcondition;
    }

    public String getName() {
        return name;
    }

    public void setMedicalcondition(String medicalcondition) {
        this.medicalcondition = medicalcondition;
    }

    public void setName(String name) {
        this.name = name;
    }
}
