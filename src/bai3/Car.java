package bai3;

public class Car {
    private final String engine;
    private final int seat;
    private final String color;

    protected Car(CarBuilder builder) {
        this.engine = builder.getEngine();
        this.seat = builder.getSeats();
        this.color = builder.getColor();
    }
    public void displayInfo() {
        System.out.println("===== Car Information =====");
        System.out.println("Engine : " + engine);
        System.out.println("Seats  : " + seat);
        System.out.println("Color  : " + color);
        System.out.println("==========================");
    }

}
