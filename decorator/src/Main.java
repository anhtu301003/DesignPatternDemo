public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $"+coffee.getCost());
        //Output: Simple Coffee $5.0

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $"+coffee.getCost());
        //Output: Simple Coffee, Milk $7.0

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $"+coffee.getCost());
        //Output: Simple Coffee, Milk, Sugar $8.0
    }
}
