
import product.Ganancia;
import product.Impuesto;
import product.ProductDetail;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class UseStore {
    public static void main(String[] args) {
        ArrayList<ProductDetail> products = new ArrayList<>();

        ProductDetail testing = new ProductDetail("Tomate", 0.52, Ganancia.ALTO);

        testing.display();
    }

    static void fillProducts(ArrayList<ProductDetail> products) {
        products.add(new ProductDetail("Tomate", 1.55, Ganancia.ALTO));
        products.add(new ProductDetail("Pollo", 1.34, Ganancia.MEDIO));
        products.add(new ProductDetail("Pan", 0.71, Impuesto.NECESIDAD));
        products.add(new ProductDetail("Maiz", 1.21));
    }
}