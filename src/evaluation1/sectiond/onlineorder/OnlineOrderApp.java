package evaluation1.sectiond.onlineorder;

public class OnlineOrderApp {
    public static void main(String[] args) {
        Customer customer =
                new Customer(1, "Nikita", "nikita@gmail.com");

        Product perfume =
                new Product(101, "Eau de parfum", 2000);

        Product bodyLotion =
                new Product(102, "Body lotion", 1000);

        Order order = new Order(1001, customer);

        OrderItem perfumeItem =
                new OrderItem(perfume, 2);

        OrderItem bodyLotionItem =
                new OrderItem(bodyLotion, 3);

        order.addItem(perfumeItem);
        order.addItem(bodyLotionItem);

        System.out.println("Order Total: " + order.calculateTotal());

        order.setStatus(OrderStatus.CONFIRMED);

        System.out.println("Order Status: " + order.getStatus());
    }
}
