//декоратор
abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;// Объект пиццы, к которому применяется декоратор

    public PizzaDecorator(Pizza pizza) {
        super(pizza.getPrice());
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}