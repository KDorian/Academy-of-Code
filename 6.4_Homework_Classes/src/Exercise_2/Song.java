package Exercise_2;

/**
 * Created by DK on 14.03.2017.
 */
public class Song {

    private String artist;
    private String name;

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public void setArtist(String artysta) {
        this.artist = artysta;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getFullNameSong() {
        System.out.println("Full name song is : " + artist + "-" + name);
    }
}
