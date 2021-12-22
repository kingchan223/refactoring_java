package chap02_magic_num.sol02_class;

public class Robot {
    /* RobotCommand 클래스 사용 */
    public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");
    public static final RobotCommand COMMAND_JUMP = new RobotCommand("JUMP");
    public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");

    private final String name;

    public Robot(String name) {
        this.name = name;
    }

    public void order(RobotCommand command){
        if(command == COMMAND_WALK) System.out.println(this.name+" walks");
        else if(command == COMMAND_JUMP) System.out.println(this.name+" stops");
        else if(command == COMMAND_STOP) System.out.println(this.name+" jumps");
        else System.out.println("There's no command like :"+command);
    }
}
