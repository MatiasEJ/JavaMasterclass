package Generics;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SoccerPlayer joe = new SoccerPlayer("joe");
        BaseballPlayer bill = new BaseballPlayer("bill");
        FutbolPlayer juan = new FutbolPlayer("juan");

        Team<SoccerPlayer> adelaideCrows = new Team<>("adelaide cros");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(bill);
//        adelaideCrows.addPlayer(juan);
        Team<BaseballPlayer> baseBallTeam = new Team<>("los chingones");
        baseBallTeam.addPlayer(bill);

    }

    private static void printDouble(@NotNull ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println( i * 2);
        }
    }
}
