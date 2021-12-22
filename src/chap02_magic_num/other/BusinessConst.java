package chap02_magic_num.other;

public interface BusinessConst {
    public static final int ROBOT_MAX_ENERGY = 100;
    /* 사람의 에너지는 로봇의 에너지보다 2배라는 비즈니스 로직이 있다면 */
    public static final int HUMAN_MAX_ENERGY1 = 200; //이렇게 하지 말고
    public static final int HUMAN_MAX_ENERGY2 = ROBOT_MAX_ENERGY*2; //이렇게 하자!!
}
