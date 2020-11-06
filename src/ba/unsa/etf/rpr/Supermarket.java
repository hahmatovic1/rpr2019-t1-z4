package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int brojElemenata; //ovo ce se automatski postaviti na 0



    boolean dodajArtikl(Artikl novi){
        if(brojElemenata >= 1000) {
            System.out.println("Magacin popunjen! Ne mozete dodavati vise artikala");
            return false;
        }
        artikli[brojElemenata] = new Artikl(novi.getNaziv(), novi.getCijena(), novi.getKod());
        brojElemenata++;
        return true;
    }


}
