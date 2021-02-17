public class Persoana {
    protected String nume, CNP;
    protected int varsta;

    void setNume(String name) {
        this.nume = name;
    }
    String getNume() {
        return this.nume;
    }
    void setCNP(String CNP) {
        this.CNP = CNP;
    }
    String getCNP() {
        return this.CNP;
    }
    void setVarsta(int nr) {
        this.varsta = nr;
    }
    int getVarsta() {
        return this.varsta;
    }
    public String toString() {
        return "Nume : " + nume + "\n" + "CNP : " + CNP + "\n" + "Varsta : " + varsta;
    }
}
