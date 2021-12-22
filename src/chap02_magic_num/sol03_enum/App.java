package chap02_magic_num.sol03_enum;

public class App {

    public static void main(String[] args) {
        Robot yo = new Robot("Yo");
        yo.order(Robot.Command.WALK);
        yo.order(Robot.Command.STOP);
        yo.order(Robot.Command.JUMP);
    }
}
