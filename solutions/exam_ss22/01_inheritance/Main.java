class Main {

    public static void main(String[] args) {
        new Main().aufgabe();
    }

    void aufgabe() {
        Drache smaug = new Drache();
        smaug.ort = "Höhle";
        smaug.feuerSpeien();
        Fabelwesen fw1 = new Phoenix();
        Fabelwesen fw2 = new Erdfabelwesen();
        Feuerfabelwesen ffw = (Feuerfabelwesen) fw2;
        Object o = new Phoenix();
        Feuerfabelwesen phoenix = o;
        Feuerfabelwesen glumanda = new Feuerfabelwesen();
        glumanda.ort = "Alabastia";
        glumanda.ausDerAscheAufsteigen();
        Drache erdwurm = new Erdfabelwesen();
        fw1.ausDerAscheAufsteigen();
    }
}
