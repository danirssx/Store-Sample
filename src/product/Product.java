package product;

import static java.lang.System.out;
import java.text.NumberFormat;
public class Product {
    private String name;
    private double price;
    private Ganancia ganancia;
    protected static NumberFormat currency = NumberFormat.getCurrencyInstance();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getGanancia() {
        return ganancia.getPorcentaje();
    }


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.ganancia = Ganancia.MEDIO;
    }

    public Product(String name, double price, Ganancia ganancia) {
        this.name = name;
        this.price = price;
        this.ganancia = ganancia;
    }
}
