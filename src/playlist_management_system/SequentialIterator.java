package playlist_management_system;

public class SequentialIterator implements Iterator {
    private Playlist playlist;
    private int index;

    public SequentialIterator(Playlist playlist) {
        this.playlist = playlist;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < playlist.songs.size();
    }

    public Song next() {
        return playlist.songs.get(index++);
    }
}