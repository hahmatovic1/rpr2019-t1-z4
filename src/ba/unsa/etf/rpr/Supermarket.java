package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int brojElemenata; //ovo ce se automatski postaviti na 0

    void dodajArtikl(Artikl novi){
        if(brojElemenata >= 1000)
            System.out.println("Magacin popunjen! Ne mozete dodavati vise artikala");
        artikli[brojElemenata] = novi;
    }


}
