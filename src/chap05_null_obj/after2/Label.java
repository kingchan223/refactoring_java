package chap05_null_obj.after2;

public class Label {
    private final String label;

    public Label(String label) {
        this.label = label;
    }

    public void display(){
        System.out.println("display:"+label);
    }

    @Override
    public String toString() {
        return "/" + label + "/";
    }

    /*팩토리 메소드*/
    public static Label newNull(){
        return NullLabel.getInstance();
    }

    /*null 객체 중첩 클래스*/
    public static class NullLabel extends Label {

        /*싱글톤*/
        private static final NullLabel instance = new NullLabel();

        public NullLabel() {super("none");}

        public static Label getInstance() {return instance;}

        @Override
        public void display() {
            //아무것도 하지 않음
        }
    }
}
