package chap02_magic_num.sol01_const;

public class Robot {
    /* 매직넘버를 기호 상수로 치환 */
    public static final int COMMAND_WALK = 0;
    public static final int COMMAND_STOP = 1;
    public static final int COMMAND_JUMP = 2;

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
