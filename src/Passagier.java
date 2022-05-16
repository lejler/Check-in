public class Passagier {
    
    private String name;
    private String vorname;
    private String titel;
    
    public Passagier(String name, String vorname, String titel) {
        this.name = name;
        this.vorname = vorname;
        this.titel = titel;
    }

    public void checkIn(String titel, String name, String vorname) {
        System.out.printf("{} {} {} ist eingecheckt.", titel, vorname, name);
    }

    public void onGate(String titel, String name, String vorname) {
        System.out.printf("{} {} {} befindet sich am Gate.", titel, vorname, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
