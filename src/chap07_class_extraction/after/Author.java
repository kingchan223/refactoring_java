package chap07_class_extraction.after;

public class Author {
    private String name;
    private String mail;

    public Author(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {return name;}
    public String getMail() {return mail;}
}
