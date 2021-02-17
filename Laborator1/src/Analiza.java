public class Analiza{
    private String data, analiza;
    private int glicemie;

    void setData(String data) {
        this.data = data;
    }
    String getData() {
        return this.data;
    }
    void setAnaliza(String tip) {
        this.analiza = tip;
    }
    String getAnaliza() {
        return this.analiza;
    }
    void setGlicemie(int valoare) {
        this.glicemie = valoare;
    }
    int getGlicemie() {
        return this.glicemie;
    }
    public String toString() {
        return "Data : " + data + "\n" + "Analiza : " + analiza + "\n" + "Glicemie : " + glicemie;
    }
}
