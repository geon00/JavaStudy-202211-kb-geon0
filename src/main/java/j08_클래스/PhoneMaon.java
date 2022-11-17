package j08_클래스;

public class PhoneMaon {

    public static void main(String[] args) {

        Phone iPhone14 = new Phone();
        Phone GalaxyS22 = new Phone("SAMSUNG", "GALAXYS22");

        System.out.println(iPhone14);
        System.out.println(GalaxyS22);

        iPhone14.company = "Apple";

        iPhone14.printPhoneCompany();
        iPhone14.printPhoneModel();

        GalaxyS22.printPhoneCompany();
        GalaxyS22.printPhoneModel();

    }
}








/*

   Class: Student, StudentMain
   학생 정보
   String School(학교명)
   String name(학생이름)
   int StudentYear(학년)
   boolean gender(성별 true=남, false=여)

   showStudentInfo(){
   학교명: 부산대학교
   이름: 홍길동
   학년: 3
   성별: 남
   }


 */