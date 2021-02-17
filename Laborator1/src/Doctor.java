public class Doctor extends Persoana{
    private String specializare, spital;
    private int vechime;

    void setSpecializare(String spec) {
        this.specializare = spec;
    }
    String getSpecializare() {
        return this.specializare;
    }
    void setSpital(String spital) {
        this.spital = spital;
    }
    String getSpital() {
        return this.spital;
    }
    void setVechime(int nr) {
        this.vechime = nr;
    }
    int getVechime() {
        return this.vechime;
    }
    public String toString() {
        return "Nume : " + nume + "\n" + "CNP : " + CNP + "\n" + "Varsta : " + varsta + "\n" +
                "Spital : " + spital + "\n" + "Specializare : " + specializare + "\n" + "Vechime : " + vechime;
    }
}
