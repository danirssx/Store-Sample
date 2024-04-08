package product;

import static java.lang.System.out;
public class ProductDetail extends Product {
    private double unitPrice;
    private Impuesto impuesto;
    private double finalPrice;

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getImpuesto() {
        return impuesto.getPorcentaje();
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    private void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    private void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

//    CONSTRUCTORS

    public ProductDetail(String name, double price) {
        super(name, price);
        setUnitPrice(getPrice() * (1 + (getGanancia() / 100)));
        this.impuesto = Impuesto.NORMAL;
        setFinalPrice(getUnitPrice() * (1 + (getImpuesto() / 100)));
    }

    public ProductDetail(String name, double price, Ganancia ganancia) {
        super(name, price, ganancia);
        setUnitPrice(getPrice() * (1 + (getGanancia() / 100)));
        this.impuesto = Impuesto.NORMAL;
        setFinalPrice(getUnitPrice() * (1 + (getImpuesto() / 100)));
    }

    public ProductDetail(String name, double price, Impuesto impuesto) {
        super(name, price);
        setUnitPrice(getPrice() * (1 + (getGanancia() / 100)));
        this.impuesto = impuesto;
        setFinalPrice(getUnitPrice() * (1 + (getImpuesto() / 100)));
    }

    public ProductDetail(String name, double price, Ganancia ganancia, Impuesto impuesto) {
        super(name, price, ganancia);
        setUnitPrice(getPrice() * (1 + (getGanancia() / 100)));
        this.impuesto = impuesto;
        setFinalPrice(getUnitPrice() * (1 + (getImpuesto() / 100)));
    }

//    PRINT

    public void display() {

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

        out.print(getName());
        out.print("\t");
        out.print(currency.format(getPrice()));
        out.print("\t");
        out.print("\t");
        out.print(getGanancia());
        out.print("\t");
        out.print("\t");

        out.print(currency.format(getUnitPrice()));
        out.print("\t");
        out.print("\t");

        out.print(getImpuesto());
        out.print("\t");
        out.print("\t");

        out.print(currency.format(getFinalPrice()));

    }
}
