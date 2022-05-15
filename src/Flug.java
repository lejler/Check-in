public class Flug {
    
    private String flugNummer;
    private String origin;
    private String destination;
    private String abflugszeit;
    private String gate;
    private Passagier[] passagiere;
    
    public Flug(String flugNummer, String origin, String destination, String abflugsZeit, String gate,
            Passagier[] passagiere) {
        this.flugNummer = flugNummer;
        this.origin = origin;
        this.destination = destination;
        this.abflugszeit = abflugsZeit;
        this.gate = gate;
        this.passagiere = passagiere;
    }

    public void ausrufen() {

    }

    public String getMaschine() {
        return flugNummer;
    }

    public void setMaschine(String maschine) {
        this.flugNummer = maschine;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAbflugsZeit() {
        return abflugszeit;
    }

    public void setAbflugsZeit(String abflugsZeit) {
        this.abflugszeit = abflugsZeit;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public Passagier[] getPassagiere() {
        return passagiere;
    }

    public void setPassagiere(Passagier[] passagiere) {
        this.passagiere = passagiere;
    }

}
