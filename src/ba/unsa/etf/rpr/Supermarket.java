package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli;
    private int brojElemenata;

    public Supermarket() {
        artikli = new Artikl[1000];
        brojElemenata = 0;
    }


    public boolean dodajArtikl(Artikl novi){
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

    public static void ispisArtikala(Artikl[] artikli){
        for(int i=0; i<1000; i++)
            if((artikli[i])!=null)System.out.println(artikli[i].getNaziv() + " " + artikli[i].getKod());
            else return;
    }

  public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbaci = null;

        for(int i = brojElemenata-1; i >= 0; i--){
            if(kod.equals(artikli[i].getKod())) {
                izbaci = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                for(int j = i; j < brojElemenata; j++){
                    artikli[j] = null;
                    if(j<brojElemenata-1) artikli[j] = artikli[j+1];
                }
            }
        }
        brojElemenata--;
        return  izbaci;
    }

}
