package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sat s = new Sat(15,30,45);
        s.ispisi();
        s.sljedeci();
        s.ispisi();
        s.prethodni();
        s.ispisi();
        s.pomjeriZa(15);
        s.ispisi();
    }
}
