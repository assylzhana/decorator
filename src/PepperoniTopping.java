//подкласс декоратора
class PepperoniTopping extends PizzaDecorator {
    private static final double TOPPING_COST = 200.0;

    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + TOPPING_COST;
    }
}