package de.gds2.kaffeemaschiene;

public class Rezept {
    protected ZutatenBehaelter wasser = new ZutatenBehaelter(2, 100, "Wasser");
    protected ZutatenBehaelter kaffee = new ZutatenBehaelter(20, 100, "Kaffee");
    protected ZutatenBehaelter kakao = new ZutatenBehaelter(20, 100, "Kakao");
    protected ZutatenBehaelter zucker = new ZutatenBehaelter(20, 100, "Zucker");
    protected ZutatenBehaelter milch = new ZutatenBehaelter(20, 100, "Milch");

    @Override
    public String toString() {
        return "Füllstände:" + "\n" +
                wasser + "\n" +
                kaffee + "\n" +
                kakao + "\n" +
                zucker + "\n" +
                milch + "\n";
    }

    public void kaffeeSchwarz() {
        wasser.zutatEntnehmen(0.2);
        kaffee.zutatEntnehmen(0.2);
    }

    public void kaffeeZucker() {
        wasser.zutatEntnehmen(0.2);
        kaffee.zutatEntnehmen(0.2);
        zucker.zutatEntnehmen(0.2);
    }

    public void kaffeeMilch() {
        wasser.zutatEntnehmen(0.2);
        kaffee.zutatEntnehmen(0.2);
        milch.zutatEntnehmen(0.2);
    }

    public void kaffeeMilchZucker() {
        wasser.zutatEntnehmen(0.2);
        kaffee.zutatEntnehmen(0.2);
        milch.zutatEntnehmen(0.2);
        zucker.zutatEntnehmen(0.2);
    }

    public void kakaomachen() {
        wasser.zutatEntnehmen(0.2);
        milch.zutatEntnehmen(0.2);
        kakao.zutatEntnehmen(0.2);
    }

    public ZutatenBehaelter getWasser() {
        return wasser;
    }

    public void setWasser(ZutatenBehaelter wasser) {
        this.wasser = wasser;
    }

    public ZutatenBehaelter getKaffee() {
        return kaffee;
    }

    public void setKaffee(ZutatenBehaelter kaffee) {
        this.kaffee = kaffee;
    }

    public ZutatenBehaelter getKakao() {
        return kakao;
    }

    public void setKakao(ZutatenBehaelter kakao) {
        this.kakao = kakao;
    }

    public ZutatenBehaelter getZucker() {
        return zucker;
    }

    public void setZucker(ZutatenBehaelter zucker) {
        this.zucker = zucker;
    }

    public ZutatenBehaelter getMilch() {
        return milch;
    }

    public void setMilch(ZutatenBehaelter milch) {
        this.milch = milch;
    }
}
