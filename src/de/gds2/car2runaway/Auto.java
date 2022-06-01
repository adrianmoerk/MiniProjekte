package de.gds2.car2runaway;

public class Auto {
    private double leistung;
    private String marke;
    private String modell;
    private int anzahlSitze;
    private double startkm;
    private double endkm;
    private double tankmenge;
    private String naechsterTuev;
    private String naechsterkundendienst;
    private boolean verfuegbar;
    private boolean automatik = false;
    private boolean barrierefrei = true;
    private String antriebsart;

    public Auto(String marke, String modell, int anzahlSitze, double tankmenge, boolean automatik, boolean barrierefrei, String antriebsart) {
        this.marke = marke;
        this.modell = modell;
        this.anzahlSitze = anzahlSitze;
        this.tankmenge = tankmenge;
        this.automatik = automatik;
        this.barrierefrei = barrierefrei;
        this.antriebsart = antriebsart;
    }


    public Auto() {
    }

    public double getLeistung() {
        return leistung;
    }

    public void setLeistung(double leistung) {
        this.leistung = leistung;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getAnzahlSitze() {
        return anzahlSitze;
    }

    public void setAnzahlSitze(int anzahlSitze) {
        this.anzahlSitze = anzahlSitze;
    }

    public double getStartkm() {
        return startkm;
    }

    public void setStartkm(double startkm) {
        this.startkm = startkm;
    }

    public double getEndkm() {
        return endkm;
    }

    public void setEndkm(double endkm) {
        this.endkm = endkm;
    }

    public double getTankmenge() {
        return tankmenge;
    }

    public void setTankmenge(double tankmenge) {
        this.tankmenge = tankmenge;
    }

    public String getNaechsterTuev() {
        return naechsterTuev;
    }

    public void setNaechsterTuev(String naechsterTuev) {
        this.naechsterTuev = naechsterTuev;
    }

    public String getNaechsterkundendienst() {
        return naechsterkundendienst;
    }

    public void setNaechsterkundendienst(String naechsterkundendienst) {
        this.naechsterkundendienst = naechsterkundendienst;
    }

    public boolean isVerfuegbar() {
        return verfuegbar;
    }

    public void setVerfuegbar(boolean verfuegbar) {
        this.verfuegbar = verfuegbar;
    }

    public boolean isAutomatik() {
        return automatik;
    }

    public void setAutomatik(boolean automatik) {
        this.automatik = automatik;
    }

    public boolean isBarrierefrei() {
        return barrierefrei;
    }

    public void setBarrierefrei(boolean barrierefrei) {
        this.barrierefrei = barrierefrei;
    }

    public String getAntriebsart() {
        return antriebsart;
    }

    public void setAntriebsart(String antriebsart) {
        this.antriebsart = antriebsart;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marke='" + marke + '\'' +
                ", modell='" + modell + '\'' +
                ", anzahlSitze='" + anzahlSitze + '\'' +
                '}';
    }
}
