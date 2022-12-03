import java.util.*;
import java.io.*;

public class day2part2 {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("src/day2.txt");
        Scanner scanner = new Scanner(inputFile);

        //13434 too high
        //10056 too low
        int totalScore = 0;
        String line = "";

        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] vals = line.split(" ");

            totalScore += selectVal(vals);

//            totalScore += winDrawLosePoints(vals);
//            totalScore += selectionPoints(vals);

        }
        System.out.println(totalScore);

    }

    public static int selectVal(String[] vals) {
        char outcome = vals[1].charAt(0);
        char opponent = vals[0].charAt(0);

        if(outcome == 'X') { //Lose
            if(opponent == 'A') {
                return 3;
            } else if(opponent == 'B') {
                return 1;
            } else {
                return 2;
            }
        } else if (outcome == 'Y') { //Draw
            if(opponent == 'A') {
                return 4;
            } else if(opponent == 'B') {
                return 5;
            } else {
                return 6;
            }
        } else { //Win
            if(opponent == 'A') {
                return 8;
            } else if(opponent == 'B') {
                return 9;
            } else {
                return 7;
            }
        }
    }

    public static int selectionPoints(String[] vals) {
        String me = vals[1];
        if(me.equals("X")) return 1;
        else if (me.equals("Y")) return 2;
        return 3;
    }

    public static int winDrawLosePoints(String[] vals) {
        char opponent = vals[0].charAt(0);
        char me = vals[1].charAt(0);

        if(opponent - 'A' == me - 'X') {
            return 3;
        } else if (opponent == 'A') { //Rock
            if(me == 'Y') {
                return 6;
            } else {
                return 0;
            }
        } else if (opponent == 'B') { //Paper
            if(me == 'Z') {
                return 6;
            } else {
                return 0;
            }
        } else { //Scissors
            if(me == 'X') {
                return 6;
            } else {
                return 0;
            }
        }
    }
}
