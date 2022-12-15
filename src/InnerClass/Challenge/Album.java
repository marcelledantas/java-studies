package InnerClass.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

//    private ArrayList<Song> songs;
    private String name;
    private String artist;
    private SongList songList;

    private class SongList{


        public SongList() {
            this.songs = new ArrayList<>();
        }

        private ArrayList<Song> songs;

        public boolean addSong(String songTitle, double duration){
            if(findSong(songTitle) == null){
                this.songs.add(new Song(songTitle, duration));
                return true;
            }
            System.out.printf("Song" + songTitle + " already exists in the album " + name);
            return false;
        }

        private Song findSong(String songTitle){
//        for(int i = 0; i < this.songs.size(); i++){
//            if(this.songs.get(i).getTitle().equals(songTitle)){
//                return this.songs.get(i);
//            }
//        }
//        return null;

// Another way to Loop
            for(Song checkSong: this.songs){
                if(checkSong.getTitle().equals(songTitle)){
                    return checkSong;
                }
            }
            return null;
        }
    }

    public Album(String albumName, String artist) {
//        this.songs = new ArrayList<>();
        this.songList = new SongList();
        this.name = albumName;
        this.artist = artist;
    }

    public boolean addSong(String songTitle, double duration){
        return songList.addSong(songTitle, duration);
    }

//    private Song findSong(String songTitle){
////        for(int i = 0; i < this.songs.size(); i++){
////            if(this.songs.get(i).getTitle().equals(songTitle)){
////                return this.songs.get(i);
////            }
////        }
////        return null;
//
//        for(Song checkSong: this.songList.songs){
//            if(checkSong.getTitle().equals(songTitle)){
//                return checkSong;
//            }
//        }
//        return null;
//    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){

        int index = trackNumber - 1;
        if((index >= 0) && (index <= this.songList.songs.size())){
            playList.add(this.songList.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){

        Song songFound = this.songList.findSong(title);
        if(songFound == null){
            System.out.println("This album does not have a song called " + title);
            return false;
        }

        playList.add(songFound);
        return true;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }
}
