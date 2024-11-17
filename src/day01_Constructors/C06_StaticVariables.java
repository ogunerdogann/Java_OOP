package day01_Constructors;

public class C06_StaticVariables {

    static int numberStatic = 20;
    int numberInstance = 40;

    public static void main(String[] args) {

        C06_StaticVariables obj1 = new C06_StaticVariables();
        obj1.numberStatic++;
        obj1.numberInstance++;



        C06_StaticVariables obj2 = new C06_StaticVariables();
        obj2.numberStatic++;
        obj2.numberInstance++;



        C06_StaticVariables obj3 = new C06_StaticVariables();
        obj3.numberStatic++;
        obj3.numberInstance++;


        System.out.println("obj1 numberStatic: "+obj1.numberStatic+ " obj1 numberInstance: "+obj1.numberInstance);
        //obj1 numberStatic: 23 obj1 numberInstance: 41

        System.out.println("obj2 numberStatic: "+obj2.numberStatic+ " obj1 numberInstance: "+obj2.numberInstance);
        //obj2 numberStatic: 23 obj1 numberInstance: 41

        System.out.println("obj3 numberStatic: "+obj3.numberStatic+ " obj1 numberInstance: "+obj3.numberInstance);
        //obj3 numberStatic: 23 obj1 numberInstance: 41
    }
}
