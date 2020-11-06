package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli;
    private int brojElemenata;

    public Korpa() {
        artikli = new Artikl[50];
        brojElemenata = 0;
    }

    public boolean dodajArtikl(Artikl novi){
        if(brojElemenata >= 50) {
            System.out.println("Korpa puna! Ne mozete dodavati vise artikala");
            return  false;
        }
        artikli[brojElemenata] = new Artikl(novi.getNaziv(), novi.getCijena(), novi.getKod());
        brojElemenata = brojElemenata + 1;
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public int dajUkupnuCijenuArtikala(){
        int iznos = 0;
        for(int i = 0; i< brojElemenata; i++)
            iznos += artikli[i].getCijena();
        return iznos;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbaci = null;

        for(int i = brojElemenata -1; i >= 0; i--){
            if(kod.equals(artikli[i].getKod())) {
                izbaci = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                for(int j = i; j < brojElemenata -i; j++){
                    artikli[j] = null;
                    artikli[j] = artikli[j+1];
                }
            }
        }
        return  izbaci;
    }

}
