package playlist_management_system;

import java.util.Collections;

public class ShuffleIterator implements Iterator {
    private Playlist playlist;
    private int index;

    public ShuffleIterator(Playlist playlist) {
        this.playlist = playlist;
        Collections.shuffle(playlist.songs);
        this.index = 0;
    }

    public boolean hasNext() {
        return index < playlist.songs.size();
    }

    public Song next() {
        return playlist.songs.get(index++);
    }
}