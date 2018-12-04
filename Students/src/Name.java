// Name.java

import java.util.Random;

public enum Name {
    Female("Ada", "Adela", "Adelajda", "Adrianna", "Agata", "Agnieszka", "Aldona",
            "Aleksandra", "Alicja", "Alina", "Amanda", "Amelia", "Anastazja",
            "Andżelika", "Aneta", "Anita", "Anna", "Antonina", "Barbara", "Beata",
            "Berenika", "Bernadeta", "Blanka", "Bogusława", "Bożena","Cecylia",
            "Celina", "Czesława", "Dagmara", "Danuta", "Daria", "Diana", "Dominika",
            "Dorota", "Edyta", "Eliza", "Elwira", "Elżbieta", "Emilia", "Eugenia",
            "Ewa", "Ewelina", "Felicja", "Franciszka", "Gabriela", "Grażyna", "Halina",
            "Hanna", "Helena","Iga", "Ilona", "Irena", "Irmina", "Iwona", "Izabela",
            "Jadwiga", "Janina", "Joanna", "Jolanta", "Jowita", "Judyta", "Julia",
            "Julita", "Justyna", "Kamila", "Karina", "Karolina", "Katarzyna", "Kazimiera",
            "Kinga", "Klaudia", "Kleopatra", "Kornelia", "Krystyna", "Laura", "Lena",
            "Leokadia", "Lidia", "Liliana", "Lucyna", "Ludmiła", "Luiza", "Łucja","Magdalena",
            "Maja", "Malwina", "Małgorzata", "Marcelina", "Maria", "Marianna", "Mariola",
            "Marlena", "Marta", "Martyna", "Marzanna", "Marzena", "Matylda", "Melania",
            "Michalina", "Milena", "Mirosława", "Monika", "Nadia", "Natalia", "Natasza",
            "Nikola", "Nina","Olga", "Oliwia", "Otylia", "Pamela", "Patrycja", "Paula",
            "Paulina", "Regina", "Renata", "Roksana", "Róża", "Rozalia","Sabina", "Sandra",
            "Sara", "Sonia", "Stanisława", "Stefania", "Stella", "Sylwia","Tamara", "Tatiana",
            "Teresa", "Urszula","Weronika", "Wiesława", "Wiktoria", "Wioletta","Zofia",
            "Zuzanna", "Zyta", "Żaneta"),
    Male("Adam", "Adolf", "Adrian", "Albert", "Aleksander", "Aleksy", "Alfred", "Amadeusz",
            "Andrzej", "Antoni", "Arkadiusz", "Arnold", "Artur", "Bartłomiej", "Bartosz",
            "Benedykt", "Beniamin", "Bernard", "Błażej", "Bogdan", "Bogumił", "Bogusław",
            "Bolesław", "Borys", "Bronisław", "Cezary", "Cyprian", "Cyryl", "Czesław",
            "Damian", "Daniel", "Dariusz", "Dawid", "Dionizy", "Dominik", "Donald","Edward",
            "Emanuel", "Emil", "Eryk", "Eugeniusz", "Fabian", "Feliks", "Ferdynand", "Filip",
            "Franciszek", "Fryderyk", "Gabriel", "Gerard", "Grzegorz", "Gustaw", "Henryk", "Herbert",
            "Hilary", "Hubert", "Ignacy", "Igor", "Ireneusz","Jacek", "Jakub", "Jan", "Janusz",
            "Jarosław", "Jerzy", "Joachim", "Józef", "Julian", "Juliusz","Kacper", "Kajetan", "Kamil",
            "Karol", "Kazimierz", "Klaudiusz", "Konrad", "Krystian", "Krzysztof", "Lech", "Leon", "Leszek",
            "Lucjan", "Ludwik","Łukasz", "Maciej", "Maksymilian", "Marceli", "Marcin", "Marek", "Marian",
            "Mariusz", "Mateusz", "Michał", "Mieczysław", "Mikołaj", "Miłosz", "Mirosław","Nikodem",
            "Norbert","Olaf", "Olgierd", "Oskar", "Patryk", "Paweł", "Piotr", "Przemysław", "Radosław",
            "Rafał", "Remigiusz", "Robert", "Roman", "Rudolf", "Ryszard","Sebastian", "Seweryn", "Sławomir",
            "Stanisław", "Stefan", "Sylwester", "Szymon", "Tadeusz", "Teodor", "Tomasz","Wacław", "Waldemar",
            "Wiesław", "Wiktor", "Witold", "Władysław", "Włodzimierz", "Wojciech","Zbigniew", "Zdzisław", "Zenon", "Zygmunt");

    private String[] names;

    Name(String... strings){
        names = strings;
    }

    public String getName() {
        return names[new Random().nextInt(names.length)];
    }
}