public class Azione {
    private String tipo;
    private String esito;
    private String giocatoreId;   // es: "G1", "G2"

    public Azione(String tipo, String esito, String giocatoreId) {
        this.tipo = tipo;
        this.esito = esito;
        this.giocatoreId = giocatoreId;
    }

    public String getTipo() { return tipo; }
    public String getEsito() { return esito; }
    public String getGiocatoreId() { return giocatoreId; }

    @Override
    public String toString() {
        return tipo + " - " + esito + " (" + giocatoreId + ")";
    }
}
