public class Monkey2 {
    public String name;
    public String feature;

    {
        name = "长尾猴";
        feature = "长尾巴";
    }

    public static void main(String[] args) {
        Monkey2 monkey2 = new Monkey2();

        System.out.println("名称: "+monkey2.name+"\n特征: "+monkey2.feature);
    }
}
