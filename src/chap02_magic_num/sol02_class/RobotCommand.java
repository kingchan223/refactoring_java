package chap02_magic_num.sol02_class;

/*클래스로 분류하여 사용자가 컴파일 시점에 오류를 알 수 있다.*/
public class RobotCommand {

    public final String name;

    public RobotCommand(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "[ RobotCommand :"+this.name +" ]";
    }
}
