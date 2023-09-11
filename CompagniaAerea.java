import java.util.HashMap;

public class CompagniaAerea {
    public HashMap<String, Cliente> clienti;
    public HashMap<String, Volo> voli;
    public HashMap<Volo, Prenotazione> prenotazioni;

    public CompagniaAerea() {
        this.clienti = new HashMap<String, Cliente>();
        this.voli = new HashMap<String, Volo>();
        this.prenotazioni = new HashMap<Volo, Prenotazione>();
    }

    public void aggiungiCliente(String nome, String cognome, String nazioneDiNascita, String cittaDiNascita, String dataDiNascita) {
        Cliente cliente = new Cliente(nome, cognome, nazioneDiNascita, cittaDiNascita, dataDiNascita, dataDiNascita);
        this.clienti.put(cliente.codiceCliente, cliente);
    }

    public void aggiungiVolo(String codiceVolo, String aeroportoPartenza, String aeroportoArrivo, String dataPartenza, String oraDiPartenza, String oraDiArrivo, int numeroPostiDisponibili, int costoVolo) {
        Volo volo = new Volo(codiceVolo, aeroportoPartenza, aeroportoArrivo, dataPartenza, oraDiPartenza, oraDiArrivo, numeroPostiDisponibili, costoVolo);
        this.voli.put(volo.codiceVolo, volo);
    }

    public void eliminaCliente(String codiceCliente) {
        this.clienti.remove(codiceCliente);
    }

    public void eliminaVolo(String codiceVolo) {
        this.voli.remove(codiceVolo);
    }

    public void modificaCliente(String codiceCliente, String nome, String cognome, String nazioneDiNascita, String cittaDiNascita, String dataDiNascita) {
        Cliente cliente = new Cliente(nome, cognome, nazioneDiNascita, cittaDiNascita, dataDiNascita, dataDiNascita);
        this.clienti.replace(codiceCliente, cliente);
    }

    public void modificaVolo(String codiceVolo, String aeroportoPartenza, String aeroportoArrivo, String dataPartenza, String oraDiPartenza, String oraDiArrivo, int numeroPostiDisponibili, int costoVolo) {
        Volo volo = new Volo(codiceVolo, aeroportoPartenza, aeroportoArrivo, dataPartenza, oraDiPartenza, oraDiArrivo, numeroPostiDisponibili, costoVolo);
        this.voli.replace(codiceVolo, volo);
    }

    public void ricercaCliente(String codiceCliente) {
        System.out.println(this.clienti.get(codiceCliente).toString());
    }

    public void ricercaClientePErNomeECognome(String nome, String cognome) {
        for (Cliente cliente : this.clienti.values()) {
            if (cliente.nome.equals(nome) && cliente.cognome.equals(cognome)) {
                System.out.println(cliente.toString());
            }
        }
    }

    public void ricercaVolo(String codiceVolo) {
        System.out.println(this.voli.get(codiceVolo).toString());
    }

    //ricerca volo per data di partenza, aeroporto di partenza, aeroporto di arrivo e ora di partenza
    public void ricercaVolo(String dataPartenza, String aeroportoPartenza, String aeroportoArrivo, String oraDiPartenza) {
        for (Volo volo : this.voli.values()) {
            if (volo.dataPartenza.equals(dataPartenza) && volo.aeroportoPartenza.equals(aeroportoPartenza) && volo.aeroportoArrivo.equals(aeroportoArrivo) && volo.oraDiPartenza.equals(oraDiPartenza)) {
                System.out.println(volo.toString());
            }
        }
    }

    public void nuovaPrenotazione(String codiceCliente, String codiceVolo, int numeroBagagli, int pesoBagagli) {
        Prenotazione prenotazione = new Prenotazione(codiceCliente, codiceVolo, numeroBagagli, pesoBagagli);
        this.prenotazioni.put(this.voli.get(codiceVolo), prenotazione);
    }

    public void eliminaPrenotazione(String codiceVolo, String codiceCliente) {
        for(Prenotazione prenotazione : this.prenotazioni.values()) {
            if(prenotazione.codiceCliente.equals(codiceCliente) && prenotazione.codiceVolo.equals(codiceVolo)) {
                this.prenotazioni.remove(this.voli.get(codiceVolo), prenotazione);
            }
        }
    }

    public void modificaPrenotazione(String codiceVolo, String codiceCliente, int numeroBagagli, int pesoBagagli) {
        for(Prenotazione prenotazione : this.prenotazioni.values()) {
            if(prenotazione.codiceCliente.equals(codiceCliente) && prenotazione.codiceVolo.equals(codiceVolo)) {
                prenotazione.numeroBagagli = numeroBagagli;
                prenotazione.pesoBagagli = pesoBagagli;
            }
        }
    }

    public void ricercaPrenotazioniCliente(String codiceCliente) {
        for(Prenotazione prenotazione : this.prenotazioni.values()) {
            if(prenotazione.codiceCliente.equals(codiceCliente)) {
                System.out.println(prenotazione.toString());
            }
        }
    }

    public void ricercaPrenotazioniVolo(String codiceVolo) {
        for(Prenotazione prenotazione : this.prenotazioni.values()) {
            if(prenotazione.codiceVolo.equals(codiceVolo)) {
                System.out.println(prenotazione.toString());
            }
        }
    }
}
