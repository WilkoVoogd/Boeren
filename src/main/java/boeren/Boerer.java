package boeren;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Boerer {
    private final List<Player> players;
    private Maten teamOne;
    private Maten teamTwo;

    public Boerer(List<Player> players) {
        this.players = players;
    }

    public void appointMaten() {
        Player one = players.get(getRandomInt(players.size()));
        players.remove(one);
        Player two = players.get(getRandomInt(players.size()));
        players.remove(two);
        this.teamOne = new Maten(one, two);
        this.teamTwo = new Maten(players.get(0), players.get(1));
    }

    private int getRandomInt(int bound) {
        Random rand = new Random();
        return rand.nextInt(bound);
    }

    public List<Maten> getMatenList() {
        return (Arrays.asList(teamOne, teamTwo));
    }
}
