package de.gds2.logging.bufferedreader;

public class Logobj {
    private String uhrzeitEingeloggt;
    private String uhrzeitAusgeloggt;
    private String datumEingeloggt;
    private String datumAusgeloggt;
    private String user;

    public Logobj(String uhrzeitEingeloggt, String uhrzeitAusgeloggt, String datumEingeloggt, String datumAusgeloggt, String user) {
        this.uhrzeitEingeloggt = uhrzeitEingeloggt;
        this.uhrzeitAusgeloggt = uhrzeitAusgeloggt;
        this.datumEingeloggt = datumEingeloggt;
        this.datumAusgeloggt = datumAusgeloggt;
        this.user = user;
    }

    public String getUhrzeitEingeloggt() {
        return uhrzeitEingeloggt;
    }

    public void setUhrzeitEingeloggt(String uhrzeitEingeloggt) {
        this.uhrzeitEingeloggt = uhrzeitEingeloggt;
    }

    public String getUhrzeitAusgeloggt() {
        return uhrzeitAusgeloggt;
    }

    public void setUhrzeitAusgeloggt(String uhrzeitAusgeloggt) {
        this.uhrzeitAusgeloggt = uhrzeitAusgeloggt;
    }

    public String getDatumEingeloggt() {
        return datumEingeloggt;
    }

    public void setDatumEingeloggt(String datumEingeloggt) {
        this.datumEingeloggt = datumEingeloggt;
    }

    public String getDatumAusgeloggt() {
        return datumAusgeloggt;
    }

    public void setDatumAusgeloggt(String datumAusgeloggt) {
        this.datumAusgeloggt = datumAusgeloggt;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
