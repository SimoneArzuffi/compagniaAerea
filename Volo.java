public class Volo {
    public String codiceVolo;   // es. AZ1234
    public String aeroportoPartenza;
    public String aeroportoArrivo;
    public String dataPartenza;
    public String oraDiPartenza;
    public String oraDiArrivo;
    public int numeroPostiDisponibili;
    public int costoVolo;

    public Volo(String codiceVolo, String aeroportoPartenza, String aeroportoArrivo, String dataPartenza, String oraDiPartenza, String oraDiArrivo, int numeroPostiDisponibili, int costoVolo) {
        this.codiceVolo = codiceVolo;
        this.aeroportoPartenza = aeroportoPartenza;
        this.aeroportoArrivo = aeroportoArrivo;
        this.dataPartenza = dataPartenza;
        this.oraDiPartenza = oraDiPartenza;
        this.oraDiArrivo = oraDiArrivo;
        this.numeroPostiDisponibili = numeroPostiDisponibili;
        this.costoVolo = costoVolo;
    }

    @Override
    public String toString() {
        return "Volo{" +
                "codiceVolo='" + codiceVolo + '\'' +
                ", aeroportoPartenza='" + aeroportoPartenza + '\'' +
                ", aeroportoArrivo='" + aeroportoArrivo + '\'' +
                ", dataPartenza='" + dataPartenza + '\'' +
                ", oraDiPartenza='" + oraDiPartenza + '\'' +
                ", oraDiArrivo='" + oraDiArrivo + '\'' +
                ", numeroPostiDisponibili=" + numeroPostiDisponibili +
                ", costoVolo=" + costoVolo +
                '}';
    }

}
