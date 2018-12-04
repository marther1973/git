import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> schoolclassIa = new ArrayList<>();
        ArrayList<Student> schoolclassIb = new ArrayList<Student>();
        initializeList(students, schoolclassIa, schoolclassIb);

        System.out.println("Students");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("--> " + students.get(i).toString());
        }

        System.out.println("Class 1a");
        for (Student stud: schoolclassIa) {
            stud.setLastname("!!!" + stud.getLastname());
            System.out.println("--> " + stud.toString());
        }

        System.out.println(students.size() + "\r\n" + " klasa Ia: " + "\r\n" + schoolclassIa.toString() + "\r\n" + " klasa Ib: " + "\r\n" + schoolclassIb.toString());
        System.out.println(students.toString());


//
//        String filePath = "D:/file.txt";
//        FileWriter fileWriter = null;
//
//        try {
//            fileWriter = new FileWriter(filePath);
//            fileWriter.write(students.toString());
//        } finally {
//            if (fileWriter != null) {
//                fileWriter.close();




//              }
//          }
    }

    private static void initializeList(ArrayList <Student> students, ArrayList <Student> schoolclassIa, ArrayList <Student> schoolclassIb) {
        Student s1 = new Student (1, "Corney", "Cutbush", "Male", 16);
        students.add(s1);
    }

}
