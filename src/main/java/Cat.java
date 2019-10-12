public class Cat extends Animal {
    private String feather;
    private String color;
    private String food;
    private String name;

    public Cat(String feather, String color, String food, String name) {
        this.feather = feather;
        this.color = color;
        this.food = food;
        this.name = name;
    }

    public static void main(String[] args) {
//        Animal animal = new Cat("毛", "咖啡色", "鱼罐头", "加菲猫") {
//            @Override
//            public void breathe(Cat cat) {
//                breathe(cat);
//            }
//        };
//        }

        Cat cat = new Cat("毛", "咖啡色", "鱼罐头", "加菲猫");

        Animal animal = new Animal() {
            @Override
            public void breathe(Animal animal) {
                cat.breathe(animal);
            }
        };


    }
}
