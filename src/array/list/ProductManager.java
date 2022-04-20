package array.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager extends Product{
    String noResult = "khong co dau!!!";
    ArrayList<Product> productArrayList = new ArrayList<>();
    int id = 1;
    public void add(Product product) {
        productArrayList.add(product);

    }
    public void edit(String name, Product product) {
        if (search(name) != -1) {
            productArrayList.set(search(name), product);
        } else {
            System.out.println(noResult);
        }
    }
    public void del(String name) {
        if (search(name) != -1) {
            productArrayList.remove(search(name));
        } else {
            System.out.println(noResult);
        }
    }
    public int search(String name) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getName() == name) {
                System.out.println(productArrayList.get(i));
                return i;
            }
        }
        System.out.println(noResult);
        return -1;
    }

    public void display() {
        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println(productArrayList.get(i));
        }
        System.out.println("-----------------------------------");
    }

    public void addVIP(String name, int price) {

        Product product1 = new Product(name, price, id);
        id++;
        add(product1);
    }

    public void sort() {
        Collections.sort(productArrayList);
    }

}
