public class Patient {
    private String name;
    private int age;
    private Eye lefteye;
    private Eye righteye;
    private Hearth hearth;
    private Stomach stomach;
    private Skin skin  ;

    public Patient(String name, int age, Eye lefteye, Eye righteye, Hearth hearth, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.lefteye = lefteye;
        this.righteye = righteye;
        this.hearth = hearth;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Eye getLefteye() {
        return lefteye;
    }

    public void setLefteye(Eye lefteye) {
        this.lefteye = lefteye;
    }

    public Eye getRighteye() {
        return righteye;
    }

    public void setRighteye(Eye righteye) {
        this.righteye = righteye;
    }

    public Hearth getHearth() {
        return hearth;
    }

    public void setHearth(Hearth hearth) {
        this.hearth = hearth;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}
