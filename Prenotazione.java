public class Prenotazione {
    public String codiceCliente;
    public String codiceVolo;
    public int numeroBagagli;
    public int pesoBagagli;

    public Prenotazione(String codiceCliente, String codiceVolo, int numeroBagagli, int pesoBagagli) {
        this.codiceCliente = codiceCliente;
        this.codiceVolo = codiceVolo;
        this.numeroBagagli = numeroBagagli;
        this.pesoBagagli = pesoBagagli;
    }
}
