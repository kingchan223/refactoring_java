package chap02_magic_num.before;

public class Robot {
    private final String name;

    public Robot(String name) {
        this.name = name;
    }

    public void order(int command){
        if(command == 0) System.out.println(this.name+" walks");
        else if(command == 1) System.out.println(this.name+" stops");
        else if(command == 2) System.out.println(this.name+" jumps");
        else System.out.println("There's no command like :"+command);
    }
}
