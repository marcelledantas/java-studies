package Generics.Challenge;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // ArrayList<Team> teams;
//        Collection.sort(teams);
//        Create a generic class to implement a league table for a sport
//        The class should allow teams to be added to the list, and store a list of teams that belong to the league
        // Your class should have a method to print out the teams in order, with the team at the top of the league printed first

        //Only teams of the same type should be added to any particular instance of the league class - the program should fail to compile if
        // an attempt is made to add an incompatible team.

        League<SoccerTeam> brasileirao = new League<>("Brasileirao");

        Team<SoccerTeam> flamengo = new Team<>("Flamengo");
        Team<SoccerTeam> vasco = new Team<>("Vasco");
        Team<SoccerTeam> fluminense = new Team<>("Fluminense");

        Team<BaseballTeam> ligaNacional = new Team<>("Liga nacional");

        // Adding match results

        brasileirao.addTeam(flamengo);
        brasileirao.addTeam(vasco);
        brasileirao.addTeam(fluminense);

        flamengo.matchResult(vasco, 1,2);
        flamengo.matchResult(vasco, 1,1);
        flamengo.matchResult(vasco, 0,1);

        fluminense.matchResult(vasco, 1,5);
        fluminense.matchResult(vasco, 1,0);

        fluminense.matchResult(flamengo, 1,2);
        fluminense.matchResult(flamengo, 1,1);



        brasileirao.printTeams();

    }
}
