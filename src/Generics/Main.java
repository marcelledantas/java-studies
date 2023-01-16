package Generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer brady = new BaseballPlayer("Brady");
        SoccerPlayer xavier = new SoccerPlayer("Xavier");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> adelaideBulls = new Team<>("Adelaide Crows");

        adelaideBulls.addPlayer(joe);

        adelaideCrows.addPlayer(joe);
        System.out.println(adelaideCrows.numPlayer());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Bulls");
        baseballTeam.addPlayer(brady);

        adelaideCrows.matchResult(adelaideBulls, 1,0);
        System.out.println("Rankings");

        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(adelaideCrows.compareTo(adelaideBulls));


//        Team<String> brokenTeam = new Team<>("wont work");
//        brokenTeam.addPlayer("no one");

//        adelaideCrows.matchResult(teamOpponent, 1,0);
//        adelaideCrows.matchResult(teamOpponent, 2,2);
//        adelaideCrows.matchResult(teamOpponent, 1,0);
//        adelaideCrows.matchResult(teamOpponent, 4,5);

    }

    public static void printDoubled(ArrayList<Integer> items){
        for(int i : items){
            System.out.println (i * 2);
        }
    }

}
