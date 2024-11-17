package day01_Constructors;

public class C01_Car {

    String brand = "No Brand";
    String modelName;
    String color;
    int modelYear;
    int price;


    public C01_Car(){
        // This is a constructor with no parameter.
        // Default constructors are public and have no parameter.
        // Default constructors have also no codes in their bodies.
    }

    @Override
    public String toString() {
        return "C01_Car{" +
                "brand='" + brand + '\'' +
                ", modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                ", modelYear=" + modelYear +
                ", price=" + price +
                '}';

        // To create such a toString method you should follow;
        // Code -> Generate -> toString  from IDE.
    }

    public C01_Car(String brand, String modelName, String color, int modelYear, int price){
        // This is a constructor with parameters.

        this.brand = brand;
        this.modelName = modelName;
        this.color = color;
        this.modelYear = modelYear;
        this.price = price;

        // this.brand = the brand variable of constructor
    }
}
