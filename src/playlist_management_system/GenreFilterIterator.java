package playlist_management_system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenreFilterIterator implements Iterator {
    private List<Song> filteredSongs;
    private int index;

    public GenreFilterIterator(Playlist playlist, String genre) {
        filteredSongs = new ArrayList<>();
        for (Song song : playlist.getSongs()) {
            if (song.getGenre().equals(genre)) {
                filteredSongs.add(song);
            }
        }
        Collections.shuffle(filteredSongs);
        this.index = 0;
    }

    public boolean hasNext() {
        return index < filteredSongs.size();
    }

    public Song next() {
        return filteredSongs.get(index++);
    }
}