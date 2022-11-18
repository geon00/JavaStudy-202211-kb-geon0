package j09_접근지정자.캡슐화;

public class Student2 {

    private String school;
    private String name;
    private int year;
    private boolean gender = false;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isGender() {
        return gender;
    }

    public boolean setGender(boolean gender) {
        return this.gender = gender;



    }

    public void printInfo() {
        System.out.println("SchoolName: " + school);
        System.out.println("Name: " + name);
        System.out.println("year: " + year);
        System.out.println("Gender: " + gender);
    }
}