public class Transakcja {
    private int kwota;
    private String tytul;
    private String imieOsoby;
    private  String nazwiskoOsoby;
    private int idOsoby;

    public Transakcja(int kwota, String tytul, String imieOsoby, String nazwiskoOsoby, int idOsoby) {
        this.kwota = kwota;
        this.tytul = tytul;
        this.imieOsoby = imieOsoby;
        this.nazwiskoOsoby = nazwiskoOsoby;
        this.idOsoby = idOsoby;
    }
}
