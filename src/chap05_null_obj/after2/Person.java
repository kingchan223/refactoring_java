package chap05_null_obj.after2;

public class Person {
    private final Label name;
    private final Label mail;

    public Person(Label name, Label mail) {
        this.name = name;
        this.mail = mail;
    }

    public Person(Label name) {
        this(name, Label.newNull());
    }

    public void display(){
        name.display();
        mail.display();
    }

    @Override
    public String toString() {
        String retVal = "";
        retVal+=name.toString();
        retVal+=mail.toString();
        return retVal;
    }
}
