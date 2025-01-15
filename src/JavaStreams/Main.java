package JavaStreams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(0, "Samsung Galaxy S21", "Elettronica", 799.99);
        Product product2 = new Product(1, "Piccolo chimico", "Baby", 129.99);
        Product product3 = new Product(2, "The Lord of The Rings - deluxe", "Books", 199.99);
        Product product4 = new Product(3, "Lo Hobbit", "Books", 29.99);
        Product product5 = new Product(4, "Fender Stratocaster", "Boys", 999.99);
        Product product6 = new Product(5, "LEGO Star Wars", "Boys", 59.90);
        Product product7 = new Product(6, "Nike Kids Sneakers", "Boys", 79.99);
        Product product8 = new Product(7, "Nerf Blaster", "Baby", 39.99);

        Customer customer1 = new Customer(0, "Aldo", 3);
        Customer customer2 = new Customer(1, "Giovanni", 2);
        Customer customer3 = new Customer(2, "Giacomo", 0);

        List<Product> myList = new ArrayList<>();
        myList.add(0, product1);
        myList.add(1, product2);
        myList.add(2, product3);
        myList.add(3, product4);
        myList.add(4, product5);

        List<Product> otherList = new ArrayList<>();
        otherList.add(0, product2);
        otherList.add(1, product8);


        Order order1 = new Order(1,"Spedito", LocalDate.of(2024, 12, 20), LocalDate.of(2025, 1,15), myList, customer2);
        System.out.println("Ordine: " + order1.toString());

        Order order2 = new Order(2, "In Lavorazione", LocalDate.now(), LocalDate.of(2025, 1, 18), otherList, customer1 );

        List<Product> allProd = Arrays.asList(product1, product2, product3, product4, product5);

        List<Product> booksProducts = allProd.stream().filter(product -> "Books".equals(product.getCategory()) && product.getPrice()>100).toList();

        System.out.println("Books: " + booksProducts.toString());

        List<Order> ordini = new ArrayList<>();
        ordini.add(order1);
        ordini.add(order2);

        List<Order> ordiniBaby = ordini.stream().filter(order -> "Baby".equals(order.getProducts()))

    }
}
