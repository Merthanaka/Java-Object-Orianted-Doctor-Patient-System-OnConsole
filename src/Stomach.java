public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String medicalcondition, boolean isEmpty) {
        super(name, medicalcondition);
        this.isEmpty = isEmpty;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        if (this.isEmpty()){
            System.out.println("Need to be fed ");
        }
    }
    public void digest(){
        System.out.println("Digesting begin");
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
