package chap06_method_extraction.after;

public class Banner {
    private final String content;

    public Banner(String content) {
        this.content = content;
    }

    public void print(int times){
        printBorder();
        printContent(times);
        printBorder();
    }

    private void printContent(int times) {
        for (int i = 0; i < times; i++)
            System.out.println("|"+content+"|");
    }

    private void printBorder() {
        System.out.print("+");
        for (int i = 0; i < 13; i++)
            System.out.print("-");
        System.out.println("+");
    }
}
