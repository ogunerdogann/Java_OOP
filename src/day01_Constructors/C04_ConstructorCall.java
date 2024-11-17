package day01_Constructors;

public class C04_ConstructorCall {

    public C04_ConstructorCall(){
        this(7);        // With this line we call the constructor with int parameter. Line 13
    }

    public C04_ConstructorCall(String name){
        System.out.println("constructor with str parameter is working");
    }

    public C04_ConstructorCall(int number){
        System.out.println("constructor with int parameter is working");
    }

    public static void main(String[] args) {

        method1();
        C04_ConstructorCall obj = new C04_ConstructorCall();
    }


    public static void method1(){
        method2();
        System.out.println("Method1 is called");
    }

    public static void method2(){
        System.out.println("Method2 is called");
    }
}
