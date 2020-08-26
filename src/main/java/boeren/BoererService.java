package boeren;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BoererService {

    private List<String> collectPlayersFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return Arrays.asList(userInput.split("\\s*,\\s*"));
    }

    private List<Player> createPlayerList() {
        System.out.println("Welkom in de BovenBazenBoerMachine");
        System.out.println("Wie zijn de spelers? Zet een komma tussen elke speler");
        List<String> userInputtedPlayers;
        do {
            userInputtedPlayers = collectPlayersFromUserInput();
            if (userInputtedPlayers.size() != 4) {
                System.out.println("Voer 4 makkers in");
            }
        } while (userInputtedPlayers.size() != 4);

        List<Player> players = new ArrayList<>();
        userInputtedPlayers.forEach(player -> players.add(new Player(player)));
        return players;
    }



    public static void main(String[] args) throws InterruptedException {
        BoererService service = new BoererService();
        Boerer boerer = new Boerer(service.createPlayerList());
        boerer.appointMaten();
        System.out.println("Oh WoW. Daar zitten een paar krokante knapen tussen");
        System.out.println("een momentje...");
        Maten teamOne = boerer.getMatenList().get(0);
        Maten teamTwo = boerer.getMatenList().get(1);
        Thread.sleep(1500);
        System.out.println();
        System.out.println("okay. De Malse Maten deze boom zijn: "
                + System.lineSeparator()
                + " -- "
                + teamOne.getPlayerOne().getName()
                + " & "
                + teamOne.getPlayerTwo().getName()
                + System.lineSeparator()
                + " -- "
                + teamTwo.getPlayerOne().getName()
                + " & "
                + teamTwo.getPlayerTwo().getName());

        Thread.sleep(99999);
    }
}
