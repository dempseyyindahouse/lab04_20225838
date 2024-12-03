import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> listTracks = new ArrayList<Track>();

    public CompactDisc(String id, String title, String category, float cost, int length, String artist) {
        super(title, category, cost, length, artist);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    // Phương thức thêm track vào danh sách
    public void addTrack(Track track) {
        if (listTracks.contains(track)) {
            System.out.println(track.getTitle() + " is already in the list.");
        } else {
            listTracks.add(track);
             System.out.println(track.getTitle() + " added to the list.");
        }
    }

    public void removeTrack(Track track) {
        if (listTracks.contains(track)) {
            listTracks.remove(track);
          System.out.println(track.getTitle() + " removed from the list.");
        } else {
            System.out.println(track.getTitle() + " is not in the list.");
        }
    }
  public int getLength();
}

    @Override
    public void play() {
        if (listTracks.isEmpty()) {
            System.out.println("NO tracks in the CD to play.");
        }
    }
}
