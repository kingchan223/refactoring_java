package chap06_method_extraction.preview;

public class PrintContents {

    public void print(String content, int times){
        printBorder();
        printContent(content, times);
        printBorder();
    }

    /*컨텐츠 출력*/
    private void printContent(String content, int times) {
        System.out.println("+");
        for (int i = 0; i < times; i++)
            System.out.print(content);
        System.out.println("+");
    }

    /*테두리 출력*/
    private void printBorder() {
        System.out.println("+");
        for (int i = 0; i < 10; i++)
            System.out.print("-----------------");
        System.out.println("+");
    }
}
