package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a = new Artikl("hrana za pse", 10, "100");
        assertEquals("hrana za pse", a.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("hrana za pse", 10, "100");
        assertEquals(10, a.getCijena());
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("hrana za pse", 10, "100");
        assertEquals("100", a.getKod());
    }
}