// Q ) Create a package named music and define a class Song inside it.
// The Song class should have instance variables title, artist, and duration, and methods play() to play the song, 
// and displayDetails() to display the song's details. Create another class Music in a different package and 
// use the Song class to play a song and display its details.

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
