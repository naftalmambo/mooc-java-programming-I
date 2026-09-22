
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String file = scanner.nextLine();

        System.out.println("Team: ");
        String team = scanner.nextLine();

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                if (team.equals(homeTeam)) {
                    gamesPlayed++;

                    if (homeScore > awayScore) {
                        wins++;

                    } else if (homeScore < awayScore) {
                        losses++;

                    }

                }

                if (team.equals(awayTeam)) {
                    gamesPlayed++;

                    if (awayScore > homeScore) {
                        wins++;

                    } else if (awayScore < homeScore)
                        losses++;

                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
