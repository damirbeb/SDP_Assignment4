package playlist_management_system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    public List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public SequentialIterator getSequentialIterator() {
        return new SequentialIterator(this);
    }

    public ShuffleIterator getShuffleIterator() {
        return new ShuffleIterator(this);
    }

    public GenreFilterIterator getGenreFilterIterator(String genre) {
        return new GenreFilterIterator(this, genre);
    }
}