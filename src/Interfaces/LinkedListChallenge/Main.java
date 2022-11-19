package Interfaces.LinkedListChallenge;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<>();

    public static void main(String[] args) {


        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer",4.6);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("The gypsy", 4.2);

        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("Lets Go", 3.38);
        album.addSong("Evil walks", 5.12);

        albums.add(album);

        List<Song> playList = new ArrayList<>();
        // List is a generic type. It is a good practice do something like
        // List<Song> playList = new ArrayList<>(); set to a specific type like new Vector(), new LinkedList()
        // The generic type List supports all the linkedList methods, because it has these methods in its interface

        albums.get(0).addToPlayList("Hold on", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList); //does not exist
        albums.get(0).addToPlayList(4, playList);

        albums.get(1).addToPlayList("For those about to rock", playList);
        albums.get(1).addToPlayList("Holy man", playList);
        albums.get(1).addToPlayList("Lets Go", playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(24, playList); //does not exist

        play(playList);
    }

    private static void play(List<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> playListIterator = playList.listIterator();

        if(playList.isEmpty()){
            System.out.println("The playList is empty");
            return;
        } else{
            System.out.println("Now playing");
            System.out.println(playListIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if(!forward){
                        if(playListIterator.hasNext()){
                            playListIterator.next();
                        }
                        forward = true;
                    }
                    if(playListIterator.hasNext()){
                        System.out.println("Now playing " + playListIterator.next().toString());
                    } else{
                        System.out.println("We reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward){
                        if(playListIterator.hasPrevious()){
                           playListIterator.previous();
                            forward = false;
                        }
                    }

                    if(playListIterator.hasPrevious()){
                        System.out.println("Now playing " + playListIterator.previous().toString());
                    } else{
                        System.out.println("We have reached the start of the playlist");
                    }

                    break;

                case 3:
                    if(forward){
                        if(playListIterator.hasPrevious()){
                            System.out.println(playListIterator.previous().toString());
                        } else{
                            System.out.println("We are at the start of the list");
                        }
                        forward = false;
                    } else{
                        if(playListIterator.hasNext()){
                            System.out.println(playListIterator.next().toString());
                        } else{
                            System.out.println("We are at the end of the list");
                        }
                        forward = true;
                    }
                    break;

                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playList.size() > 0){
                        playListIterator.remove();
                        if(playListIterator.hasNext()){
                            System.out.printf("Now playing " + playListIterator.next().toString());
                        } else if(playListIterator.hasPrevious()){
                            System.out.printf("Now playing" + playListIterator.previous().toString());
                        }
                    }
            }
        }
    }

    public static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions" +
                "6 - delete current from the playlist"
        );
    }

    public static void printList(List<Song> playList){

        ListIterator<Song> listIterator = playList.listIterator();
        System.out.println("Printing the full playlist");
        int i = 0;
        while(listIterator.hasNext()){
            System.out.println((i + 1) + " - " +listIterator.next().toString());
            i++;
        }
    }
}
