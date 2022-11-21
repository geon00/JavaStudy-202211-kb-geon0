package j10_배열;

public class Student {

    private String name;
    private int year;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;

    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}