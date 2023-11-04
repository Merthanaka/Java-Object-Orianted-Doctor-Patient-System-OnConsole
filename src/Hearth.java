public class Hearth extends Organ{
    private int rate;

    public Hearth(String name, String medicalcondition, int rate) {
        super(name, medicalcondition);
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart rate :"+this.getRate());
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
