public class Monkey1 {
    public String name;
    public String feature;

    public Monkey1() {
        name = "长尾猴";
        feature = "长尾巴";

        System.out.println("我是使用无参构造产生的猴子: \n" + "名称: " + name + "\n特征: " + feature);
    }

    public Monkey1(String name, String feature) {
        this.name = name;
        this.feature = feature;

        System.out.println("我是使用带参构造产生的猴子: \n" + "名称: " + name + "\n特征: " + feature);
    }


    public static void main(String[] args) {
        Monkey1 monkey1 = new Monkey1();

        Monkey1 monkey11 = new Monkey1("白头叶猴", "头上有白毛，喜欢吃树叶");
    }
}
