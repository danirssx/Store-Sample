
import product.Ganancia;
import product.Impuesto;
import product.ProductDetail;

import java.util.ArrayList;

import static java.lang.System.out;

public class UseStore {
    public static void main(String[] args) {
        ArrayList<ProductDetail> products = new ArrayList<>();
        fillProducts(products);

//        Displaying Products
        displayTemplate();
        products.forEach(product -> {
            product.displayProduct();
            out.println();
        });
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

    static void fillProducts(ArrayList<ProductDetail> products) {
        products.add(new ProductDetail("Tomate", 1.55, Ganancia.ALTO));
        products.add(new ProductDetail("Pollo", 1.34, Ganancia.MEDIO));
        products.add(new ProductDetail("Pan", 0.71, Impuesto.NECESIDAD));
        products.add(new ProductDetail("Maiz", 1.21));
    }
}