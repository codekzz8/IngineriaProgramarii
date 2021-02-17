public class Pacient extends Persoana{
    String spital, diagnostic;
    Analiza analiza = new Analiza();

    void setSpital(String spital) {
        this.spital = spital;
    }
    String getSpital() {
        return this.spital;
    }
    void setDiagnostic(String diag) {
        this.diagnostic = diag;
    }
    String getDiagnostic() {
        return this.diagnostic;
    }
    public String toString() {
        return "Nume : " + nume + "\n" + "CNP : " + CNP + "\n" + "Varsta : " + varsta + "\n" + "Spital : " + spital + "\n" + "Diagnostic : " + diagnostic + "\n" +
                "---Analiza---" + "\n" + analiza.toString();
    }
}
