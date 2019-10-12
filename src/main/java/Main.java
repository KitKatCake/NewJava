import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main implements Comparator<Integer>{
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",60);
        Student student2 = new Student("lisi",50);
        Student student3 = new Student("wangwu",80);
        Student student4 = new Student("zhaoliu",90);
        List<Student> students = Arrays.asList(student1,student2,student3,student4);

        //students.sort((o1, o2) -> o1.getScore() - o2.getScore());

        //students.sort(Student::compareStudentByScore);
        //students.forEach(student -> System.out.println(student.getScore()));

        students.sort(Student::compareByScore);
        students.forEach(student -> System.out.println(student.getScore()));

        int arr[] = {1,3,5,7,9,2,4,6};


        for (var p :arr){
            System.out.print(p+"/t");
        }

        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println(c.equals(a));
        System.out.println(c==a);
        System.out.println(c.hashCode());

        //System.out.println(c.getClass().toString());



      //Arrays.sort(arr,com);

    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
