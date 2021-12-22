package chap02_magic_num.before;

public class App {

    public static void main(String[] args) {
        Robot yo = new Robot("Yo");
        yo.order(0);//0은 walk
        yo.order(1);//1은 jump
        yo.order(2);//2는 stop
    }
}
