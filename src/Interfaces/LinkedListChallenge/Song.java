package Interfaces.LinkedListChallenge;

public class Song {

    private String title;
    private double duration;

    public Song(String songTitle, double songDuration) {
        this.title = songTitle;
        this.duration = songDuration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
