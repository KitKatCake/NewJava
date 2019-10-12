public abstract class Animal implements Behavior{
    public String feather;
    public String color;
    public String food;
    public String name;
    @Override
    public void breathe(Animal animal){
        System.out.println(animal.name+"呼吸");
    }
    @Override
    public void eat(Animal animal){
        System.out.println(animal.name+"吃"+animal.food);
    }
    @Override
    public void sleep(Animal animal){
        System.out.println(animal.name+"睡觉");
    }

    public Animal(){

    }

}
