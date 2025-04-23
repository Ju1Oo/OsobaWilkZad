//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Adres adres1 = new Adres("Kwiatowa 15", "Warszawa", "3A", "00-001");
        Adres adres2 = new Adres("Słoneczna 22", "Kraków", "1B", "30-002");
        Adres adres3 = new Adres("Leśna 10", "Wrocław", "2C", "50-003");

        // Tworzenie dat urodzenia
        DataUrodzenia data1 = new DataUrodzenia(15, 5, 1990);
        DataUrodzenia data2 = new DataUrodzenia(20, 8, 1985);
        DataUrodzenia data3 = new DataUrodzenia(10, 12, 2000);

        // Tworzenie osób
        Osoba osoba1 = new Osoba("Jan", "Kowalski", "Nowak", adres1, data1);
        Osoba osoba2 = new Osoba("Anna", "Nowak", "Kowalska", adres2, data2);
        Osoba osoba3 = new Osoba("Piotr", "Zalewski", "Zalewska", adres3, data3);

        // Tworzenie transakcji
        Transakcja transakcja1 = new Transakcja(150, "Zakup biletu", osoba1.GetImie(), osoba1.getNazwisko(), 1);
        Transakcja transakcja2 = new Transakcja(200, "Rezerwacja hotelu", osoba2.GetImie(), osoba2.getNazwisko(), 2);
        Transakcja transakcja3 = new Transakcja(300, "Wypożyczenie samochodu", osoba3.GetImie(), osoba3.getNazwisko(), 3);

        // Dodawanie transakcji do osób
        osoba1.Transactions.Append(transakcja1);
        osoba2.Transactions.Append(transakcja2);
        osoba3.Transactions.Append(transakcja3);
    }
}