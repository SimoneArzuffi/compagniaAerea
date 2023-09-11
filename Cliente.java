public class Cliente {
    public String nome;
    public String cognome;
    public String nazioneDiNascita;
    public String cittaDiNascita;
    public String dataDiNascita;
    public String codiceCliente;

    public Cliente(String nome, String cognome, String nazioneDiNascita, String cittaDiNascita, String dataDiNascita, String codiceCliente) {
        this.nome = nome;
        this.cognome = cognome;
        this.nazioneDiNascita = nazioneDiNascita;
        this.cittaDiNascita = cittaDiNascita;
        this.dataDiNascita = dataDiNascita;
        this.codiceCliente = creaCodiceCliente(nome, cognome, dataDiNascita);
    }

    private String creaCodiceCliente(String nome, String cognome, String dataDiNascita) {
        this.codiceCliente = nome.substring(0, 3) + cognome.substring(0, 3) + dataDiNascita.substring(0, 2);
        return this.codiceCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", nazioneDiNascita='" + nazioneDiNascita + '\'' +
                ", cittaDiNascita='" + cittaDiNascita + '\'' +
                ", dataDiNascita='" + dataDiNascita + '\'' +
                ", codiceCliente='" + codiceCliente + '\'' +
                '}';
    }
}
