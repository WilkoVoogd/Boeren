package boeren;

public class Maten {
    private final Player playerOne;
    private final Player playerTwo;

    public Maten(Player one, Player two) {
        this.playerOne = one;
        this.playerTwo = two;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }
}
