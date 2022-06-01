package de.gds2.ooaood;

public class SparKonto extends Bankkonto {
    private double zinsSatz;

    public SparKonto(double kontoStand, double zinsSatz) {
        super(kontoStand);
        this.zinsSatz = zinsSatz;
    }

    public void zinsenAnrechnen() {
        this.kontoStand = this.kontoStand + this.kontoStand * this.zinsSatz;
    }
}
