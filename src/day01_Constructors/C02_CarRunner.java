package day01_Constructors;

public class C02_CarRunner {

    public static void main(String[] args) {

        C01_Car car = new C01_Car();    // Creating a new 'car' object from C01_Car class.

        System.out.println(car.brand);      // No Brand
        System.out.println(car.modelName);  // null
        System.out.println(car.color);      // null
        System.out.println(car.modelYear);  // 0
        System.out.println(car.price);      // 0

        car.brand = "Mercedes";
        car.modelName = "CLA";
        car.color = "Red";
        car.modelYear = 2024;
        car.price = 15000;

        System.out.println("===================================================");

        System.out.println(car.brand);      // "Mercedes"
        System.out.println(car.modelName);  // "CLA"
        System.out.println(car.color);      // "Red"
        System.out.println(car.modelYear);  // 2024
        System.out.println(car.price);      // 15000

        System.out.println(car.toString());
        // Output when there is a toString() method in C01_Car = C01_Car{brand='Mercedes', modelName='CLA', color='Red', modelYear=2024, price=15000}
        //Output when there is no toString() method in C01_Car = day01_Constructors.C01_Car@6d03e736

        C01_Car car1 = new C01_Car("Audi", "A3", "Blue", 2020, 13000);
        System.out.println(car1.toString());
        // C01_Car{brand='Audi', modelName='A3', color='Blue', modelYear=2020, price=13000}

    }
}
