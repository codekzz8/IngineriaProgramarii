public class Main {
    public static void main(String[] args) {
        Persoana randomPerson = new Persoana();
        Asistent asist = new Asistent();
        Doctor doc = new Doctor();
        Pacient pac = new Pacient();

        randomPerson.setNume("Cornel");
        randomPerson.setCNP("123123123123");
        randomPerson.setVarsta(53);

        asist.setNume("Ion");
        asist.setCNP("752424246");
        asist.setVarsta(34);
        asist.setSpital("Sf. Maria");
        asist.setVechime(6);

        doc.setNume("Marius");
        doc.setCNP("5313133131");
        doc.setVarsta(65);
        doc.setSpital("Sf. Maria");
        doc.setSpecializare("Neurolog? :)");
        doc.setVechime(24);

        pac.setNume("George");
        pac.setCNP("456789567");
        pac.setVarsta(56);
        pac.setSpital("Sf. Maria");
        pac.setDiagnostic("cancer");
        pac.analiza.setAnaliza("senzational");
        pac.analiza.setData("12/5/2004");
        pac.analiza.setGlicemie(531);

        System.out.println("---Persoana---");
        System.out.println(randomPerson);
        System.out.println("");

        System.out.println("---Pacient---");
        System.out.println(pac);
        System.out.println("");

        System.out.println("---Asistent---");
        System.out.println(asist);
        System.out.println("");

        System.out.println("---Doctor---");
        System.out.println(doc);
    }
}
