package bai2;

public class Bai2 {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("Dog");
        dog.speak();

        Animal cat = AnimalFactory.getAnimal("Cat");
        cat.speak();

        try {
            Animal unknown = AnimalFactory.getAnimal("elephant");
            unknown.speak();
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Unknown animal type: elephant
        }
    }
}
