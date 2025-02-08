package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("My SSH app.");
        double miles = 5;
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " миль = " + kilometers + " кілометрів");
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
}
