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
        Product product5 = new Product(4, "Fender Stratocaster", "Boys", 24.90);

        Customer customer1 = new Customer(0, "Aldo", 3);
        Customer customer2 = new Customer(1, "Giovanni", 2);
        Customer customer3 = new Customer(2, "Giacomo", 0);

        List<Product> myList = new ArrayList<>();
        myList.add(0, product1);
        myList.add(1, product2);
        myList.add(2, product3);

        Order order1 = new Order(1,"Spedito", LocalDate.of(2024, 12, 20), LocalDate.of(2025, 1,15), myList, customer2);
        System.out.println(order1.toString());

        List<Product> allProd = Arrays.asList(product1, product2, product3, product4, product5);

        List<Product> booksProducts = allProd.stream().filter(product -> "Books".equals(product.getCategory()) && product.getPrice()>100).toList();

        System.out.println("Books: " + booksProducts.toString());
    }
}
