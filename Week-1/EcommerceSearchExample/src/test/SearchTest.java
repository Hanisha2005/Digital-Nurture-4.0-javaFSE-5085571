package test;

import model.Product;
import search.LinearSearch;
import search.BinarySearch;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Camera", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Phone", "Electronics")
        };

        Product result1 = LinearSearch.searchByName(products, "Camera");
        System.out.println("Linear Search: " + (result1 != null ? result1.getProductName() : "Not found"));

        Product result2 = BinarySearch.searchByName(products, "Mobile");
        System.out.println("Binary Search: " + (result2 != null ? result2.getProductName() : "Not found"));
    }
}
