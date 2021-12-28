package chap05_null_obj.after2;

public class App {
    public static void main(String[] args) {
        Person[] people =
                {
                    new Person(new Label("adam"), new Label("adam@gmail.com")),
                    new Person(new Label("kate"), new Label("kate@gmail.com")),
                    new Person(new Label("luna"))
                };

        for (Person person : people){
            System.out.println(person);
            person.display();
            System.out.println();
        }
    }
}
