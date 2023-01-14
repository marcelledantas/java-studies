package Generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer brady = new BaseballPlayer("Brady");
        SoccerPlayer xavier = new SoccerPlayer("Xavier");

        Team adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(brady);
        adelaideCrows.addPlayer(xavier);

        System.out.println(adelaideCrows.numPlayer());

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
