package ba.unsa.etf.rpr;

public class Sat {
    int sati, minute, sekunde;
    public Sat(int sati, int minute, int sekunde) {
        postavi(sati,minute,sekunde);
    }
    void postavi(int sati, int minute, int sekunde) {
        this.sati=sati;
        this.minute=minute;
        this.sekunde=sekunde;
    }
    final void ispisi() {
        System.out.println(sati + ":" + minute + ":" + sekunde);
    }
    final int getSati()  {
        return sati;
    }
    final int getMinute()  {
        return minute;
    }
    final int getSekunde()  {
        return sekunde;
    }


}
