package chap05_null_obj.before;

public class Person {
    private final Label name;
    private final Label mail;

    public Person(Label name, Label mail) {
        this.name = name;
        this.mail = mail;
    }

    public Person(Label name) {
        this(name, null);
    }

    public void display(){
        if(this.name != null) name.display();
        if(this.mail != null) mail.display();
    }

    @Override
    public String toString() {
        String retVal = "";
        if(this.name != null) retVal+=name.toString();
        if(this.mail != null) retVal+=mail.toString();
        return retVal;
    }
}
