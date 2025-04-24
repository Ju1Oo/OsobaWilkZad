
    public class Osoba {
        private int id;
        private String imie;
        private String nazwisko;
        private String nazwiskoPanienskieMatki;
        private Adres adres;
        private DataUrodzenia dataUrodzenia;
        private Osoba matka;
        private Osoba ojciec;
        ExtendableArray<Transakcja> Transactions;

        public Osoba(  String in_imie, String in_nazwisko, String in_nazwiskoPanienskie, Adres in_adres, DataUrodzenia in_dataUrodzenia, Osoba in_matka, Osoba in_ojciec)
        {
            imie = in_imie;
            nazwisko = in_nazwisko;
            nazwiskoPanienskieMatki = in_nazwiskoPanienskie;
            adres = in_adres;
            dataUrodzenia = in_dataUrodzenia;
            matka = in_matka;
            ojciec = in_ojciec;
        }

        public Osoba(  String in_imie, String in_nazwisko, String in_nazwiskoPanienskie, Adres in_adres, DataUrodzenia in_dataUrodzenia)
        {
            imie = in_imie;
            nazwisko = in_nazwisko;
            nazwiskoPanienskieMatki = in_nazwiskoPanienskie;
            adres = in_adres;
            dataUrodzenia = in_dataUrodzenia;
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (!(o instanceof Osoba osoba)) return true;
            return (id == osoba.getId());
        }
        public String GetImie(){
            return imie;
        }
        public String getNazwisko() {
            return nazwisko;
        }

        public int getId() {
            return id;
        }

        public DataUrodzenia getDataUrodzenia() {
            return dataUrodzenia;

        }

}
