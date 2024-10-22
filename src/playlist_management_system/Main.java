package playlist_management_system;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Song 1", "Artist 1", "Pop"));
        playlist.addSong(new Song("Song 2", "Artist 2", "Rock"));
        playlist.addSong(new Song("Song 3", "Artist 3", "Pop"));
        playlist.addSong(new Song("Song 4", "Artist 4", "Jazz"));

        Iterator sequentialIterator = playlist.getSequentialIterator();
        Iterator shuffleIterator = playlist.getShuffleIterator();
        Iterator genreFilterIterator = playlist.getGenreFilterIterator("Pop");

        System.out.println("Sequential Iterator:");
        while (sequentialIterator.hasNext()) {
            Song song = sequentialIterator.next();
            System.out.println(song.getTitle());
        }

        System.out.println("\nShuffle Iterator:");
        while (shuffleIterator.hasNext()) {
            Song song = shuffleIterator.next();
            System.out.println(song.getTitle());
        }

        System.out.println("\nGenre Filter Iterator (Pop):");
        while (genreFilterIterator.hasNext()) {
            Song song = genreFilterIterator.next();
            System.out.println(song.getTitle());
        }
    }
}