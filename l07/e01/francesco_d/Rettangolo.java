package l07.e01.francesco_d;
    class Rettangolo extends Quadrilatero {
        private double base;
        private double altezza;
    
        public Rettangolo(double base, double altezza) {
            this.base = base;
            this.altezza = altezza;
        }
    
        @Override
        public double area() {
            return base * altezza;
        }
    
        @Override
        public String lati() {
            return "Lati del rettangolo: Base = " + base + ", Altezza = " + altezza;
        }
    }
