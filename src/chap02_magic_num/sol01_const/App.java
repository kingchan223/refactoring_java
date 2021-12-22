package chap02_magic_num.sol01_const;

public class App {

    public static void main(String[] args) {
        Robot yo = new Robot("Yo");
        yo.order(Robot.COMMAND_WALK);
        yo.order(Robot.COMMAND_STOP);
        yo.order(Robot.COMMAND_JUMP);
    }
}
