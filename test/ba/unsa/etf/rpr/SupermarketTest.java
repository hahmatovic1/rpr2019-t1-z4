package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void ispravnoDodajeArtikl() {
        Supermarket s = new Supermarket();
        assertTrue(s.dodajArtikl(new Artikl("lopta", 5, "100")));
    }

    @Test
    void izbaciArtiklSaKodomKojiNijeUSupermarketu() {
        Supermarket s = new Supermarket();
        s.dodajArtikl(new Artikl("lopta", 5, "100"));
        s.dodajArtikl(new Artikl("casa", 5, "101"));
        s.dodajArtikl(new Artikl("hrana za pse", 5, "102"));

        assertNull((s.izbaciArtiklSaKodom("99")));
    }

    @Test
    void izbaciArtiklSaKodomKojiSeNalaziUUSupermarketu() {
        Supermarket s = new Supermarket();
        s.dodajArtikl(new Artikl("lopta", 5, "100"));
        s.dodajArtikl(new Artikl("casa", 5, "101"));
        s.dodajArtikl(new Artikl("hrana za pse", 5, "102"));

        assertNotNull(s.izbaciArtiklSaKodom("100"));
    }


    @Test
    void getArtikli() {

    }



}