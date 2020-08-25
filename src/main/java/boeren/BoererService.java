package boeren;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoererService {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom in de BovenBazenBoerMachine. Hoe heet speler 1?");
        players.add(new Player(scanner.nextLine()));
        System.out.println("Okay leuk. En hoe heet speler 2?");
        players.add(new Player(scanner.nextLine()));
        System.out.println("Gekke naam. En speler 3?");
        players.add(new Player(scanner.nextLine()));
        System.out.println("Nu zit je gewoon random characters in te toetsen. Wie is speler 4?");
        players.add(new Player(scanner.nextLine()));

        Boerer boerer = new Boerer(players);
        boerer.appointMaten();
        Maten teamOne = boerer.getMatenList().get(0);
        Maten teamTwo = boerer.getMatenList().get(1);

        System.out.println("okay. De maten deze boom zijn: "
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
    }
}
