import org.junit.*;
import org.junit.Assert.*;

public class Test {

    public CompagniaAerea compagniaAerea;

    @Before
    public void setUp() {
        compagniaAerea = new CompagniaAerea();
    }

    @Test
    public void testAggiungiCliente() {
        compagniaAerea.aggiungiCliente("John", "Doe", "USA", "New York", "1990-01-15");
        assertEquals(1, compagniaAerea.clienti.size());
    }

    @Test
    public void testEliminaCliente() {
        compagniaAerea.aggiungiCliente("John", "Doe", "USA", "New York", "1990-01-15");
        compagniaAerea.eliminaCliente("FL001");
        assertEquals(0, compagniaAerea.clienti.size());
    }

    @Test
    public void testAggiungiVolo() {
        compagniaAerea.aggiungiVolo("FL001", "JFK", "LAX", "2023-09-15", "08:00", "13:00", 150, 300);
        assertEquals(1, compagniaAerea.voli.size());
    }

    @Test
    public void testEliminaVolo() {
        compagniaAerea.aggiungiVolo("FL001", "JFK", "LAX", "2023-09-15", "08:00", "13:00", 150, 300);
        compagniaAerea.eliminaVolo("FL001");
        assertEquals(0, compagniaAerea.voli.size());
    }

    @Test
    public void testModificaCliente() {
        compagniaAerea.aggiungiCliente("John", "Doe", "USA", "New York", "1990-01-15");
        compagniaAerea.modificaCliente("FL001", "Jane", "Doe", "USA", "Los Angeles", "1992-03-20");
        assertEquals("Jane", compagniaAerea.clienti.get("FL001").nome);
    }

    @Test
    public void testModificaVolo() {
        compagniaAerea.aggiungiVolo("FL001", "JFK", "LAX", "2023-09-15", "08:00", "13:00", 150, 300);
        compagniaAerea.modificaVolo("FL001", "JFK", "SFO", "2023-09-15", "08:00", "13:00", 150, 350);
        assertEquals("SFO", compagniaAerea.voli.get("FL001").aeroportoArrivo);
    }

    @Test
    public void testRicercaCliente() {
        Cliente cliente = new Cliente("John", "Doe", "USA", "New York", "1990-01-15", "FL001");
        compagniaAerea.clienti.put(cliente.codiceCliente, cliente);
        assertEquals(cliente, compagniaAerea.ricercaCliente("FL001"));
    }

    @Test
    public void testRicercaClientePerNomeECognome() {
        Cliente cliente1 = new Cliente("John", "Doe", "USA", "New York", "1990-01-15", "FL001");
        Cliente cliente2 = new Cliente("Jane", "Doe", "USA", "Los Angeles", "1992-03-20", "FL002");
        compagniaAerea.clienti.put(cliente1.codiceCliente, cliente1);
        compagniaAerea.clienti.put(cliente2.codiceCliente, cliente2);

        assertEquals(cliente1, compagniaAerea.ricercaClientePErNomeECognome("John", "Doe"));
        assertEquals(cliente2, compagniaAerea.ricercaClientePErNomeECognome("Jane", "Doe"));
    }

    @Test
    public void testRicercaVolo() {
        Volo volo = new Volo("FL001", "JFK", "LAX", "2023-09-15", "08:00", "13:00", 150, 300);
        compagniaAerea.voli.put(volo.codiceVolo, volo);
        assertEquals(volo, compagniaAerea.ricercaVolo("FL001"));
    }

    @Test
    public void testNuovaPrenotazione() {
        Cliente cliente = new Cliente("John", "Doe", "USA", "New York", "1990-01-15", "FL001");
        Volo volo = new Volo("FL001", "JFK", "LAX", "2023-09-15", "08:00", "13:00", 150, 300);
        compagniaAerea.clienti.put(cliente.codiceCliente cliente);
        compagniaAerea.voli.put(volo.codiceVolo, volo);

        compagniaAerea.nuovaPrenotazione("FL001", "FL001", 2, 20);

        assertEquals(1, compagniaAerea.prenotazioni.size());
    }
}

