package Pkxy;

import javafx.util.Pair;

import java.lang.reflect.Field;

public class Demo {

    public static Pair<Integer, String> getTwo()
    {
        return new Pair<Integer, String>(10, "GeeksforGeeks");
    }

    public static Field declaredField;

    public static void main(String[] args) throws Exception{

        Class cls = Student.class;

        Student stu = (Student)cls.newInstance();

        declaredField = cls.getDeclaredField("name");

        declaredField.setAccessible(true);

        declaredField.set(stu,"tom");

        stu.syso();

        Pair<Integer, String> p = getTwo();

        System.out.println(p.getKey() + " " + p.getValue());


    }
}
