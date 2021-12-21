package chap01_uml;

interface Executable {
    void execute();
}

public abstract class ParentClass {
    Something field1;
    static int field2;

    abstract void method1();
    public void method2(){/*do somethings...*/}
    public static void method3(){/*do somethings...*/}
}

class Something { int value; }

class ChildClass extends ParentClass implements Executable{
    @Override
    public void execute() {}
    @Override
    void method1() {}
}


