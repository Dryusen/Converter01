package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("My SSH app.");

        double miles = 5;
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " миль = " + kilometers + " кілометрів");

        double km = 8;
        double milesConverted = kilometersToMiles(km);
        System.out.println(km + " кілометрів = " + milesConverted + " миль");
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}