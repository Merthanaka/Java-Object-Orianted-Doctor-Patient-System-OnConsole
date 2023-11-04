public class Eye extends Organ{
    private String color;
    private boolean isOpened;

    public Eye(String name, String medicalcondition, String color, boolean isOpened) {
        super(name, medicalcondition);
        this.color = color;
        this.isOpened = isOpened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Eye color :"+ this.getColor());
    }
    public void Open(){
        this.setOpened(true);
        System.out.println(this.getName()+"Opened");
    }
    public void Close(){
        this.setOpened(true);
        System.out.println(this.getName()+"Closed");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}
