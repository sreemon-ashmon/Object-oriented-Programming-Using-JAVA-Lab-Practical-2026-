// Q) Create a package named Music and declare a class Song.

//--------------------------------mypack[Folder]--------------------------------------//
// FILE 1 song.java :
package Music;

public class Song {
    public void play() {
        System.out.println("Song is playing...");
    }
}

//FILE 2 Main.java :
import Music.Song;

public class Main {
    public static void main(String[] args) {
        Song s = new Song();
        s.play();
    }
}
