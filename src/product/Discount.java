package product;

public enum Discount {
    PROMO_5 {
        @Override
        public double getPromo() {
            return 5;
        }
    },
    PROMO_10 {
        @Override
        public double getPromo() {
            return 10;
        }
    };

    public abstract double getPromo();
}
