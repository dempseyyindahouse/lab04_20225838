package lab02.hust.soict.dai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;
    public Disc(int length, String director) {
        this.length = length;
        this.director = director;
    }
    public Disc(String title, String category, float cost, int length, String director) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public String getDirector() {
        this.length = length;  
    }
    public void setLength(int length) {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
}
