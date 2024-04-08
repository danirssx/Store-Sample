package inventory;

import product.ProductDetail;
import java.util.ArrayList;

import static java.lang.System.out;

public class ListProduct {
    private ArrayList<ProductDetail> products;

    public ListProduct() {
        this.products = new ArrayList<>();
    }

    public void addProduct(ProductDetail product) {
        products.add(product);
    }

    public void deleteLastItem() {
        products.remove(products.size() - 1);
    }

    public void displayList() {
        products.forEach(product -> {
            product.displayProduct();
            out.println();
        });
    }

}
