public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(2899.0);
        // Декорируем пиццу добавкой
        pizza = new PepperoniTopping(pizza);
        pizza = new MushroomTopping(pizza);
        System.out.println("Final Price: " + pizza.getPrice());
    }
}