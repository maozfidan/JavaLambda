package lambdaTutorial;

public class Universite {

    /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 arklı obj'den List create ediniz.
 */

   private String universite;
   private String bolum;
   private int ogreniSayisi;
   private int notOrt;

   public Universite(){
   }

    public Universite(String universite, String bolum, int ogreniSayisi, int notOrt) {
        this.universite = universite;
        this.bolum = bolum;
        this.ogreniSayisi = ogreniSayisi;
        this.notOrt = notOrt;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgreniSayisi() {
        return ogreniSayisi;
    }

    public void setOgreniSayisi(int ogreniSayisi) {
        this.ogreniSayisi = ogreniSayisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "universite='" + universite + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogreniSayisi=" + ogreniSayisi +
                ", notOrt=" + notOrt +
                '}';
    }
}
