package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli;
    private int brojElemenata;

    public Supermarket() {
        artikli = new Artikl[1000];
        brojElemenata = 0;
    }

    boolean dodajArtikl(Artikl novi){
        if(brojElemenata >= 1000) {
            System.out.println("Magacin popunjen! Ne mozete dodavati vise artikala");
            return false;
        }
        artikli[brojElemenata] = new Artikl(novi.getNaziv(), novi.getCijena(), novi.getKod());
        brojElemenata++;
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
}
