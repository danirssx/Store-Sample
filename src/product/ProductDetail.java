package product;

import static java.lang.System.out;
public class ProductDetail extends Product {
    private double unitPrice;
    private Impuesto impuesto;
    private double finalPrice;
    private Discount discount;

    public double getUnitPrice() {
        return unitPrice;
    }

    public Impuesto getTypeImpuesto() {
        return impuesto;
    }

    public double getImpuesto() {
        return impuesto.getPorcentaje();
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public double getDiscountPrice() { return discount.getPromo(); }

    private void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    private void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public void setPromo(Discount discount) {
        this.discount = discount;
        this.finalPrice = getFinalPrice() * (1 - (discount.getPromo() / 100));
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

    public void displayProduct() {

        out.print(getName());
        out.print("\t");
        out.print(currency.format(getPrice()));
        out.print("\t");
        out.print("\t");
        out.print(getGanancia() + "%");
        out.print("\t");
        out.print("\t");

        out.print(currency.format(getUnitPrice()));
        out.print("\t");
        out.print("\t");

        out.print(getImpuesto() + "%");
        out.print("\t");
        out.print("\t");

            out.print(discount != null ? getDiscountPrice() + "%" : "null");
            out.print("\t");
            out.print("\t");


        out.print(currency.format(getFinalPrice()));

    }
}
