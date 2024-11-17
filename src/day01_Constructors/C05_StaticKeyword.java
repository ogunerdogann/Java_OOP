package day01_Constructors;

public class C05_StaticKeyword {

    static String hospitalName = "Burkay Hospital";
    static String doctorName = "Burkay Doctor";

    String personalName = "No personalName";
    String personalAdress = "No personalAdress";
    int personalAge;

    public static void main(String[] args) {

        C05_StaticKeyword pers1 = new C05_StaticKeyword();

        System.out.println(pers1.personalName); // No personalName
        System.out.println(pers1.personalAdress); // No personalAdress
        System.out.println(pers1.personalAge); // 0


        System.out.println(pers1.hospitalName); // Burkay Hospital
        System.out.println(pers1.doctorName); // Burkay Doctor


        pers1.personalName = "Ogün";
        pers1.personalAdress = "Gülsuyu";
        pers1.personalAge = 34;

        pers1.hospitalName = "Laufen Hospital";

        System.out.println(pers1.personalName); // Ogün
        System.out.println(pers1.personalAdress); // Gülsuyu
        System.out.println(pers1.personalAge); // 34

        System.out.println(pers1.hospitalName); // Laufen Hospital


        C05_StaticKeyword pers2 = new C05_StaticKeyword();

        System.out.println(pers2.personalName); // No personalName
        System.out.println(pers2.personalAdress); // No personalAdress
        System.out.println(pers2.personalAge); // 0


        System.out.println(pers2.hospitalName); // Laufen Hospital
        System.out.println(pers2.doctorName); // Burkay Doctor


    }
}
