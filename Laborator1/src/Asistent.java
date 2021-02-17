public class Asistent extends Persoana{
    private String spital;
    private int vechime;

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
                "Spital : " + spital + "\n" + "Vechime : " + vechime;
    }
}
