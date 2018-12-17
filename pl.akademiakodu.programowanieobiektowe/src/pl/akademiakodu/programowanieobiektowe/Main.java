package pl.akademiakodu.programowanieobiektowe;

public class Main {
    private static Person somePerson;

    public static void main(String[] args) {

        String name = "Oskar";
        int weight = 86;
        int height = 190;

        String name1 = "Adam";
        int weight1 = 56;
        int height1 = 170;
//
//        Person somePerson = new Person();
//        somePerson.name = "Oskar";
//        somePerson.height = 190;
//        somePerson.weight = 86;
//
//        Person somePerson1 = new Person();
//        somePerson1.name = "Oskar";
//        somePerson1.height = 191;
//        somePerson1.weight = 86;

//        Person[] array = new Person[3];
//        array[0] = new Person();
//        array[1] = new Person();
//        array[2] = new Person();


        Person somePerson = new Person("Oskar", 86,190 );
        Person somePerson1 = new Person("Adam", 56 );

        Latarka Latarka1 = new Latarka(1, 15, "black");

        somePerson.setHeight(1250);

        System.out.println(somePerson.getHeight());
        System.out.println(somePerson1.getHeight());
        System.out.println("Latarka1 ma moc " + Latarka1.power + "W.");
        System.out.println(somePerson);
    }
}
