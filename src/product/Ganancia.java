package product;

public enum Ganancia {
    BAJO {
        @Override
        public double getPorcentaje() {
            return 9;
        }
    },
    MEDIO {
        @Override
        public double getPorcentaje() {
            return 12;
     }
    },
    ALTO {
        @Override
        public double getPorcentaje() {
            return 15;
        }
    };

    public abstract double getPorcentaje();

}
