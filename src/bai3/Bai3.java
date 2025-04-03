package bai3;

public class Bai3 {
    public static void main(String[] args) {
        Car car1 = new CarBuilder()
                .setEngine("Lambogini")
                .setSeats(2)
                .setColor("Red")
                .build();
        car1.displayInfo();

        Car car2 = new CarBuilder()
                .setEngine("Audi")
                .setSeats(2)
                .setColor("pink")
                .build();
        car2.displayInfo();
    }
}
