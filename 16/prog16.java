// Q) Create a package named Music and declare a class Song.

//--------------------------------mypack[Folder]--------------------------------------//
// File: music/Song.java
package music;

public class Song {
    private String title;
    private String artist;
    private double duration; 


    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Now playing: " + title + " by " + artist);
    }

    public void displayDetails() {
        System.out.println("Song Title : " + title);
        System.out.println("Artist     : " + artist);
        System.out.println("Duration   : " + duration + " minutes");
    }
}
// File: player/Music.java
package player;

import music.Song;

public class Music {
    public static void main(String[] args) {
        Song song = new Song("Shape of You", "Ed Sheeran", 4.24);

        song.displayDetails();
        song.play();
    }
}
