package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {



    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        assertTrue(k.dodajArtikl(new Artikl("lopta", 5, "100")));
    }

    @Test
    void izbaciArtiklSaKodomKojiSeNijeUKorpi() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("lopta", 5, "100"));
        k.dodajArtikl(new Artikl("casa", 5, "101"));
        k.dodajArtikl(new Artikl("hrana za pse", 5, "102"));

        assertNull((k.izbaciArtiklSaKodom("99")));
    }

    @Test
    void izbaciArtiklSaKodomKojiJeUKorpi() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("lopta", 5, "100"));
        k.dodajArtikl(new Artikl("casa", 5, "101"));
        k.dodajArtikl(new Artikl("hrana za pse", 5, "102"));

        assertNotNull(k.izbaciArtiklSaKodom("100"));
    }



    @Test
    void ispravnoVratiArtikle() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("lopta", 5, "100"));

        assertNotNull(k.getArtikli());
    }

}