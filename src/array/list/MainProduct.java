package array.list;

import java.util.Collections;

public class MainProduct {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.addVIP("ip13" , 20000);
        productManager.addVIP("ip14" , 60000);
        productManager.addVIP("ip15" , 40000);
        productManager.addVIP("ip15" , 40000);
        productManager.addVIP("ip15" , 40000);
        productManager.addVIP("ip15" , 40000);
        productManager.addVIP("ip15" , 40000);
        productManager.addVIP("ip15" , 40000);
        productManager.display();
        productManager.search("ip16");
        productManager.sort();
        productManager.display();

        String[] aa = {"kien", "jas"};
        for (int i = 0; i < aa.length; i++) {

        }
    }
}
