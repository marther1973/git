package pl.akademiakodu.programowanieobiektowe;
public class Person {
    private String name;
    private int weight;
    private int height;

    //    KISS keep it simple stupid!
    //    YAGNI you aren't gonna need it!

    public Person(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    /* Maksymalnie ukrywaj wszystko, co się da (hermetyzuj) */
    //       DRY don't repeat yourself
    public Person(String name, int weight) {
        this(name, weight, 100);

    }

    public int getHeight() {
        return height + 10;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
