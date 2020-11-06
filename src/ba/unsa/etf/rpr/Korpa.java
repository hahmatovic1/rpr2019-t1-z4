package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int brElemenata = 0;

    public boolean dodajArtikl(Artikl novi){
        if(brElemenata >= 0) {
            System.out.println("Korpa puna! Ne mozete dodavati vise artikala");
            return  false;
        }
        artikli[brElemenata] = new Artikl(novi.getNaziv(), novi.getCijena(), novi.getKod());
        brElemenata = brElemenata + 1;
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public int dajUkupnuCijenuArtikala(){
        double iznos = 0;
        for(int i=0; i<=brElemenata; i++)
            iznos += artikli[i].getCijena();
        return  iznos;
    }
}
