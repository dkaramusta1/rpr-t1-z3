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
    void sljedeci() {
        sekunde = sekunde + 1;
        if (sekunde==60) {
            sekunde=0;
            minute = minute + 1;
        }
        if (minute==60) {
            minute=0;
            sati = sati + 1;
        }
        if (sati==24) {
            sati = 0;
        }
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
