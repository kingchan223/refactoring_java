package chap02_magic_num.sol03_enum;

import chap02_magic_num.sol02_class.RobotCommand;

public class Robot {
    /* enum 사용 */
    public enum Command{
        WALK, STOP, JUMP
    }

    private final String name;

    public Robot(String name) {
        this.name = name;
    }

    public void order(Command command){
        if(command == Command.WALK) System.out.println(this.name+" walks");
        else if(command == Command.JUMP) System.out.println(this.name+" stops");
        else if(command == Command.STOP) System.out.println(this.name+" jumps");
        else System.out.println("There's no command like :"+command);
    }
}
