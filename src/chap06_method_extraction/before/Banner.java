package chap06_method_extraction.before;

public class Banner {
    private final String content;

    public Banner(String content) {
        this.content = content;
    }

    public void print(int times){
        //테두리 출력
        System.out.print("+");
        for (int i = 0; i < 13; i++)
            System.out.print("-");
        System.out.println("+");

        //내용 출력
        for (int i = 0; i < 3; i++)
            System.out.println("|"+content+"|");

        //테두리 출력
        System.out.print("+");
        for (int i = 0; i < 13; i++)
            System.out.print("-");
        System.out.println("+");
    }
}
