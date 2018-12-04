public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private String gender;
    private int age;


    public Student (){

    }

    public Student ( int id, String firstname, String lastname, String gender, int age){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString(){
        return id + "," + firstname + "," + lastname + ","+ gender + "," + age + ";";
    }

    public int getId() {return id; }

    public void setId() {this.id = id; }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

//   public String getFullName(){ return firstname + " " + lastname; }

    public String getGender() {return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
