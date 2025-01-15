package JavaStreams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(00, "Samsung Galaxy S21", "Elettronica", 799.99);
        Product product2 = new Product(01, "Nike Air Zoom", "Sport", 129.99);
        Product product3 = new Product(02, "Il Ritorno del re", "Libri", 24.90);
        Product product4 = new Product(03, "Lo Hobbit", "Libri", 29.99);
        Product product5 = new Product(04, "Fender Stratocaster", "Musica", 24.90);

        Customer customer1 = new Customer(000, "Aldo", 3);
        Customer customer2 = new Customer(001, "Giovanni", 2);
        Customer customer3 = new Customer(002, "Giacomo", 0);

        List<Product> myList = new ArrayList<>();
        myList.add(0, product1);
        myList.add(1, product2);
        myList.add(2, product3);

        Order order1 = new Order(1,"Spedito", LocalDate.of(2024, 12, 20), LocalDate.of(2025, 1,15), myList, customer2);
        System.out.println(order1.toString());
    }
}
