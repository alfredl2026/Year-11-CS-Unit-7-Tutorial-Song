import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Song {

    private String title;
    private String artist;
    private ArrayList<String> oldListeners;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        oldListeners = new ArrayList();
        oldListeners.add("T");
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public int howMany(ArrayList<String> listeners) {
        int count = 0;
        for (String listener : listeners) {
            if (!oldListeners.contains(listener.toLowerCase())) {
                oldListeners.add(listener.toLowerCase());
                count++;
            }
        }
        return count;
    }

}
