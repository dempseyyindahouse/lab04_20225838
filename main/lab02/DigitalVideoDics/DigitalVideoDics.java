package Lab02.aims.dics;
imprort Lab02.hust.soict.dsai.aims.media.Media;

public class DigitalVideoDisc extends Media {
    private static int nbDigitalVideoDiscs = 0; // Class attribute can khai bao
    private String director;
    private int length;
     public DigitalVideoDisc(){
     }

    public DigitalVideoDisc(String title) {
        setTitle(title);
        setId(nbDigitalVideoDiscs);
        nbDigitalVideoDisc++;
    }

    // Ghi đè phương thức equals
    @Override
    public boolean equals(Object obj) {
        if(this ==obj ) return true
        if (obj == null || getClass() != obj.getClass()) return false;
        DigitalVideoDisc dvd = (DigitalVideoDisc) obj;
 return this.getTitle().equals(disc.getTitle()) &&
        this.getCategory().equals(disc.getCategory()) &&
        this.getDirector().equals(disc.getDirector()) &&
        this.getCost()==disc.getCost() &&
        this.getlength() == disc.getLength();
    }
@Override
public String toString() {
    return "DVD - "" + this.getTitle() + " - " " +
         getLength() + "mins:"+ this.getCost()+"$";
}
}
