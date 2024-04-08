
import inventory.ListProduct;
import product.Ganancia;
import product.Impuesto;
import product.ProductDetail;

import java.util.ArrayList;

import static java.lang.System.out;

public class UseStore {
    public static void main(String[] args) {
        ListProduct products = new ListProduct();
        fillProducts(products);
        products.displayList();
    }

    static void displayTemplate() {
        out.print("NAME");
        out.print("\t");
        out.print("PRICE");
        out.print("\t");
        out.print("GANANCIA");
        out.print("\t");
        out.print("UNIT PRICE");
        out.print("\t");
        out.print("IMPUESTO");
        out.print("\t");
        out.print("FINAL PRICE");

        out.println();
    }

    static void fillProducts(ListProduct products) {
        products.addProduct(new ProductDetail("Tomate", 1.55, Ganancia.ALTO));
        products.addProduct(new ProductDetail("Pollo", 1.34, Ganancia.MEDIO));
        products.addProduct(new ProductDetail("Pan", 0.71, Impuesto.NECESIDAD));
        products.addProduct(new ProductDetail("Maiz", 1.21));
    }
}