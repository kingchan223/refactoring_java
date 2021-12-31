package chap07_class_extraction.after;

public class App {
    public static void main(String[] args) {
        Book refactoringBook = new Book("Refactoring_with_java",
                "ISBN35989",
                "24000",
                "hisosi",
                "hilo@gmail.com");

        System.out.println(refactoringBook.toXml());
    }
}
