package product;

public enum Impuesto {
    NECESIDAD {
        @Override
        public double getPorcentaje() {
            return 10;
        }
    },
    NORMAL {
        @Override
        public double getPorcentaje() {
            return 21;
        }
    };

    public abstract double getPorcentaje();
}
