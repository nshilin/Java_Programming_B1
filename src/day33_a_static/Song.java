package day33_a_static;

public class Song {
    //data: name, length, artist, genre

    String name;
    double length;
    String artist;
    String genre;

//Constructors: 1. name and length
//2. name, length, artist
//3. name, length, artist, genre

    public Song(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public Song(String name, double length, String artist) {
        this(name, length);
        this.artist = artist;
    }

    public Song (String name, double length, String artist, String genre) {
        this(name, length, artist);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song: " +
                "\nname: " + name +
                "\nlength: " + length +
                "\nartist: " + artist +
                "\ngenre: " + genre;
    }
}
