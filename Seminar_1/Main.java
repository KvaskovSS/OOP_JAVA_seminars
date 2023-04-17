package Seminar_1;
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new Product("cheese", 300))
                .addProduct(new Product("water", 10))
                .addProduct(new Product("wine", 330))
                .addProduct(new Yogurt("Danone", 300, "sweet"))
                .addProduct(new Perfume("Si", 6500, "Dior"))
                .addProduct(new Chocolate("Milka", 99, "Milk chocolate"))
                .addProduct(new Chocolate("Alenka", 49, "Not milk chocolate"))
                .addProduct(new Milk("Milk 1", 1000, 0.5))
                .addProduct(new Milk("Milk 2", 1500, 1))
                .addProduct(new Juice("Juice 1", 2000, "j7", 0.5))
                .addProduct(new Juice("Juice 2", 2000, "j9", 1));

        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        Product found = vendingMachine.findProduct("water");
        System.out.println(found);
        System.out.println("Покупаем товар");
        Product sold = vendingMachine.sellProduct(found);
        System.out.println(sold);
        System.out.println("В автомате столько денег:");
        System.out.println(vendingMachine.getAmount());
        System.out.println("---------------------");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        System.out.println("Покупаем товар");
        Product perfume = vendingMachine.sellProduct(vendingMachine.findProduct("Si"));
        System.out.println(perfume);
        System.out.println("Осталось товаров: ");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        System.out.println("Денег в автомате: ");
        System.out.println(vendingMachine.getAmount());
        try {
            Product perf = vendingMachine.sellProduct(vendingMachine.findProduct("Si"));
            System.out.println(perf);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}
