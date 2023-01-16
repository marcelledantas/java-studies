package Generics.Final;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> adelaineCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        adelaineCrows.matchResult(melbourne, 2,5);
        adelaineCrows.matchResult(hawthorn, 2,1);
        adelaineCrows.matchResult(fremantle, 0,1);

        footballLeague.add(adelaineCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();


        Team<BaseballPlayer> baseballBulls = new Team<>("Fremantle");
//        footballLeague.add(baseballBulls); // Compile error

    }

}
