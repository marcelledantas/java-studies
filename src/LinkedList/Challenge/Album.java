package LinkedList.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private ArrayList<Song> songs;
    private String name;
    private String artist;

    public Album(String albumName, String artist) {
        this.songs = new ArrayList<>();
        this.name = albumName;
        this.artist = artist;
    }

    public boolean addSong(String songTitle, double duration){
        if(findSong(songTitle) != null){
            System.out.println("Song" + songTitle + " already exists in the album " + this.name);
            return false;
        }
        this.songs.add(new Song(songTitle, duration));
        System.out.println("Song" + songTitle + " added successfully");
        return true;
    }

    private Song findSong(String songTitle){
//        for(int i = 0; i < this.songs.size(); i++){
//            if(this.songs.get(i).getTitle().equals(songTitle)){
//                return this.songs.get(i);
//            }
//        }
//        return null;

        for(Song checkSong: this.songs){
            if(checkSong.getTitle().equals(songTitle)){
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){

        int index = trackNumber - 1;
        if((index >= 0) && (index <= this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){

        Song songFound = findSong(title);
        if(songFound == null){
            System.out.println("This album does not have a song called " + title);
            return false;
        }

        playList.add(songFound);
        return true;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }
}
