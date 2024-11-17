package day01_Constructors;

public class C03_CodeReading {

    String name = "No Name";
    String adress = "No Adress";
    int age;

    C03_CodeReading(){
        age = 40;
    }

    C03_CodeReading(int age){
        age = 23;       // !!! There is no 'this' keyword here. Check the outputs below.
        adress = "Cankaya";
    }

    C03_CodeReading(String name, String adress){
        this.name = name;
        this.adress = adress;
    }

    public static void main(String[] args) {

        C03_CodeReading obj = new C03_CodeReading();
        System.out.println(obj.age + "," + obj.name + "," + obj.adress); //40,No Name,No Adress

        C03_CodeReading obj1 = new C03_CodeReading("Ogün", "Bochum");
        System.out.println(obj1.age + "," + obj1.name + "," + obj1.adress); //0,Ogün,Bochum

        C03_CodeReading obj2 = new C03_CodeReading(29);
        System.out.println(obj2.age + "," + obj2.name + "," + obj2.adress); //0,No Name,Cankaya

    }
}
