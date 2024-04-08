package inventory;

import product.Ganancia;
import product.Impuesto;
import product.ProductDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class ListProduct {
    private ArrayList<ProductDetail> products;

//    Getters
    public ArrayList<ProductDetail> getProducts() {
        return products;
    }

//    Constructors
    public ListProduct() {
        this.products = new ArrayList<>();
    }

//    Edit items
    public void addProduct(ProductDetail product) {
        products.add(product);
    }

    public ProductDetail getByName(String key) {
        return products.stream().filter((product) -> product.getName().equalsIgnoreCase(key)).findFirst().orElse(null);
    }

    public void getByGanancia(Ganancia key) {
        products.stream().filter((product) -> product.getTypeGanancia().equals(key)).forEach(product -> {
            product.displayProduct();
            out.println();
        });
    }

    public void getByImpuesto(Impuesto key) {
        products.stream().filter((product) -> product.getTypeImpuesto().equals(key)).forEach(product -> {
            product.displayProduct();
            out.println();
        });
    }

    public void deleteLastItem() {
        products.removeLast();
    }

//  Display Products
    public void displayList(ArrayList<ProductDetail> products) {
        products.forEach(product -> {
            product.displayProduct();
            out.println();
        });
    }

}
