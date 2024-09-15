/*
     Set B:
            b) Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg).
               Create an array of n player objects .Calculate the batting average for each player using static method avg().
               Define a static sort method which sorts the array on the basis of average.
               Display the player details in sorted order.
 */
package assignment2.setB;
import java.util.Arrays;
import java.util.Scanner;

class CricketPlayer implements Comparable<CricketPlayer> {
    private String playerName;
    private int noOfInnings;
    private int noOfTimesNotOut;
    private int totalRuns;
    private float batAvg;

    public CricketPlayer(String playerName, int noOfInnings, int noOfTimesNotOut, int totalRuns) {
        this.playerName = playerName;
        this.noOfInnings = noOfInnings;
        this.noOfTimesNotOut = noOfTimesNotOut;
        this.totalRuns = totalRuns;
    }

    public float battingAverage() {
        float innings = noOfInnings - noOfTimesNotOut;
        if (innings > 0)
            return (float) totalRuns / innings;
        return 0f;
    }

    public static void avg(CricketPlayer[] players) {
        for (CricketPlayer player : players) {
            player.batAvg = player.battingAverage();
        }
    }

    @Override
    public int compareTo(CricketPlayer o) {
        return Float.compare(o.batAvg, this.batAvg);
    }

    public void display() {
        System.out.println("Player Name: " + playerName + ", No of Innings: " + noOfInnings + ", No of Times Not Out: " + noOfTimesNotOut + ", Total Runs: " + totalRuns + ", Batting Average: " + batAvg);
    }
}

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of players:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        CricketPlayer[] players = new CricketPlayer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for player " + (i + 1) + ":");
            System.out.print("Player Name: ");
            String name = sc.nextLine();
            System.out.print("No Of Innings: ");
            int innings = sc.nextInt();
            System.out.print("No Of Times Not Out: ");
            int notOut = sc.nextInt();
            System.out.print("Total Runs: ");
            int totalRuns = sc.nextInt();
            sc.nextLine(); // Consume newline

            players[i] = new CricketPlayer(name, innings, notOut, totalRuns);
        }

        CricketPlayer.avg(players);
        Arrays.sort(players);

        System.out.println("\nPlayer details in sorted order by average:");
        for (CricketPlayer player : players) {
            player.display();
        }

        sc.close();
    }
}
