// LastName.java

import java.util.Random;

public enum LastName {
    Female("Złotkowska","Szeptycka","Smolska","Pączkowska","Osowiecka","Lisieska","Kossykowska","Gałąska","Bojewska","Aszeńska"),
    Male("Albiński","Bonikowski","Błeszyński","Cizewski","Drągowski","Godlewski","Kalejczycki","Korczakowski","Maicki","Purzycki"),
    Unisex("Abraamowicz","Beńko","Chanik","Fermuz","Goraj","Horoszko","Kasiuk","Lejzorowicz","Michniewicz","Ruczyk");
    private String[] lastnames;

    LastName(String... strings){
        lastnames = strings;
    }

    public String getLastName() {
        return lastnames[new Random().nextInt(lastnames.length)];
    }
}