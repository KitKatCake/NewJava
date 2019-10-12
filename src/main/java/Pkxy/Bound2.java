package Pkxy;

public class Bound2 <T extends AA & Binter> {
    private T objRef;

    public Bound2(T obj){
        this.objRef = obj;
    }

    public void doRunTest(){
        this.objRef.displayClass();
    }

}
