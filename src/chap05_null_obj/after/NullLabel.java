package chap05_null_obj.after;

public class NullLabel extends Label{

    public NullLabel() {
        super("none");
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public void display() {
        /*아무것도 하지 않음*/
    }
}
