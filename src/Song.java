public class Song {
    private String name;
    private String authorName;
    private String albumName;

    public Song(String name, String authorName, String albumName) {
        this.name = name;
        this.authorName = authorName;
        this.albumName = albumName;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAlbumName() {
        return albumName;
    }
}
